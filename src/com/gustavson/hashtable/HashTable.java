package com.gustavson.hashtable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * A HashTable to be used to map a key to a value, it has basic methods to remove, add, search, etc. for data within it.
 * <br/>
 * <p>
 * This Hash Table is built "under the hood" with an array, but each "slot" in this array will represent a Doubly Linked List.
 * This Hash Table to deal with collisions will use the Separate Chaining concept to deal
 * with collisions (if there are two elements that map to the same index (bucket) in the Array,
 * the elements will be stored as if they were contained in a Doubly Linked List).
 * </p>
 * <p>
 * <strong>Note</strong> whenever a custom data type is used (a class) that a programmer creates and is used as a key,
 * it is good practice/strongly recommended to override the {@link Object equals} and {@link Object hashCode}
 * methods in the classes that the programmer creates (and uses as a key), as a HashTable needs these methods overridden
 * from the {@link Object} class. The {@link Object equals} and {@link Object hashCode} methods
 * are crucial to how this HashTable operates. The HashTable needs to determine how two entries are equal
 * (determined by the {@link Object equals} method in the class that
 * is used as the {@link TKey} AKA the key for the HashTable) and a way to map an entry to it's corresponding position
 * (index) in the Hash Table (determined by the {@link Object hashCode} method in the class, that is used as the key).
 * </p>
 * <br/>
 * See {@link com.gustavson.hashtable.Entry} for the details of what an Entry in a Hash Table consists of.
 *
 * @param <TKey>   The type of Keys to be stored.
 * @param <TValue> The type of Values to be stored.
 */
public class HashTable<TKey, TValue> {
    /**
     * A private static final field to represent the default capacity of the Hash Table.
     *
     * <p>
     * This default capacity will be a prime number (to try to ensure that entries are more uniformly distributed across the Hash Table).
     * In this case the default capacity will be 11.
     * </p>
     */
    private static final int DEFAULT_CAPACITY = 11;

    /**
     * A private field to describe how many total entries are within the Hash Table.
     */
    private int numberOfEntries;

    /**
     * A private field to describe the capacity (number of slots) within the Hash Table.
     */
    private int capacity;

    /**
     * A private field, this will represent the underlying structure of the Hash Table
     * (array of buckets AKA an array of Doubly Linked Lists).
     */
    private final Entry<TKey, TValue>[] table;

    /**
     * A Parametrized constructor to take in a desired capacity for the underlying data structure to hold (an array).
     * <br/>
     *
     * <p>
     * <strong>Note</strong> in this constructor, if a non prime number capacity is passed in it will set the the capacity to whatever the nearest prime number is
     * for example if a capacity of 4 is passed in, the capacity will be set to the nearest prime number which is 5. If a capacity of 5 passed in, the capacity will be set to 5 as that is a prime number.
     * </p>
     * <p>
     * A prime number is a desired capacity because prime numbers tend to better spread the entries more uniformly and reduce the chances of collisions.
     * </p>
     *
     * @param capacity The desired capacity to set the Hash Table to store, note this capacity should be a prime number (a number that is only divisible by one and itself).
     */
    public HashTable(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Error: Cannot have a zero or negative capacity. The capacity passed in was " + capacity);
        }

        if (isPrime(capacity)) {
            this.capacity = capacity;
        } else {
            this.capacity = getNextPrime(capacity);
        }

        table = new Entry[this.capacity];

        Arrays.fill(table, null);

        numberOfEntries = 0;
    }

    /**
     * The default constructor, it will apply a default capacity if not specified of 11 buckets (slots) in the array.
     */
    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * A method to see if the Hash Table is empty.
     *
     * @return <b>True</b> if the Hash Table is empty.
     * <br/>
     * <b>False</b> if the Hash Table is not empty.
     */
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    /**
     * A method to retrieve the total number of entries currently in the Hash Table.
     *
     * @return The total number of entries in the Hash Table.
     */
    public int getNumberOfEntries() {
        return this.numberOfEntries;
    }

    /**
     * A method to retrieve the number of entries with in a single bucket.
     *
     * @param index The desired index to look into.
     * @return The number of entries within the desired bucket.
     */
    public int getNumberOfEntriesInBucket(int index) {
        int count = 0;

        Entry<TKey, TValue> current = table[index];

        if (current == null) {
            return count;
        }

        while (current != null) {
            count++;

            current = current.getNext();
        }

        return count;
    }

    /**
     * A method to add an entry into the Hash table.
     * <strong>Note</strong> that if a collision occurs, the newest colliding entry will be put to the front of the chain
     *
     * @param key   The desired Key to map a piece of Data to.
     * @param value The desired Data to be stored in a Key - Value Pair.
     */
    public void put(TKey key, TValue value) {
        int index = getInsertIndex(key);

        Entry<TKey, TValue> newNode = new Entry<>(key, value);

        if (table[index] == null) {
            table[index] = newNode;

            numberOfEntries++;

            writeToFile(key, value, FileWritingOption.PUT);

            return;
        }

        newNode.setNext(table[index]);

        table[index].setPrevious(newNode);

        table[index] = newNode;

        numberOfEntries++;

        writeToFile(key, value, FileWritingOption.PUT);
    }

    /**
     * A method to add an entry into the Hash table.
     * <strong>Note</strong> that if a collision occurs, the newest colliding entry will be put to the end of the chain.
     * As such, this method will take longer to execute because it needs to traverse to the end of the list
     * and then insert that element in that position.
     * The put method should be preferred, as it will be faster.
     *
     * @param key   The desired Key to map a piece of Data to.
     * @param value The desired Data to be stored in a Key - Value Pair.
     */
    public void putLast(TKey key, TValue value) {
        int index = getInsertIndex(key);

        Entry<TKey, TValue> newNode = new Entry<>(key, value);

        if (table[index] == null) {
            table[index] = newNode;

            numberOfEntries++;

            writeToFile(key, value, FileWritingOption.PUT);

            return;
        }

        Entry<TKey, TValue> current = table[index];

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);

        newNode.setPrevious(current);
        newNode.setNext(null);

        numberOfEntries++;

        writeToFile(key, value, FileWritingOption.PUT);
    }

    /**
     * A method to add a Key - Value Pair to the Hash Table, if the Key does not already exist in the Hash Table.
     *
     * @param key   The desired Key to be added.
     * @param value The desired Data to be added.
     */
    public void putIfAbsent(TKey key, TValue value) {
        if (!containsKey(key)) {
            put(key, value);
        }
    }

    /**
     * A method to get the data (value) associated with a Key.
     *
     * @param key The Key to be used to look up the Value that is associated with that key.
     * @return The value associated with the Key.
     */
    public TValue get(TKey key) {
        if (isEmpty()) {
            return null;
        }

        if (!containsKey(key)) {
            return null;
        }

        int index = getInsertIndex(key);

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getKey().hashCode() == key.hashCode()) {
                return current.getValue();
            }

            current = current.getNext();
        }

        return null;
    }

    /**
     * A method to retrieve the <b>Value</b> in a Key - Value Pair, <b>if there is a Key</b>.
     * If there is not a key that is in the Hashtable already that matches whatever is in the parameter,
     * the <b>defaultValue</b> is returned.
     *
     * @param key          The desired Key to look up.
     * @param defaultValue The value to be returned if the Key could not be found.
     * @return The <b>Value in a Key - Value Pair, if there is a Key</b> otherwise the <b>defaultValue</b> is returned.
     */
    public TValue getOrDefault(TKey key, TValue defaultValue) {
        if (!containsKey(key)) {
            return defaultValue;
        }

        return get(key);
    }

    /**
     * A method to print the contents of the Hash Table.
     */
    public void printTable() {
        if (isEmpty()) {
            System.out.println("[]");

            return;
        }

        for (int i = 0; i < table.length; i++) {
            Entry<TKey, TValue> currentIndex = table[i];

            while (currentIndex != null) {
                System.out.print("Inside Bucket " + i + " ");
                System.out.println(currentIndex);

                if (currentIndex.getNext() != null) {
                    currentIndex = currentIndex.getNext();

                    System.out.print("\t");
                } else {
                    break;
                }
            }
        }
    }

    /**
     * A method to print the items in a given bucket.
     *
     * @param key The desired key to look through.
     */
    public void printItemsInBucket(TKey key) {
        int index = getInsertIndex(key);

        if (isEmpty()) {
            return;
        }

        if (!containsKey(key)) {
            return;
        }

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            System.out.println(current);

            current = current.getNext();
        }
    }

    /**
     * A method to print the items in a bucket.
     *
     * @param index The desired index to print items within.
     */
    public void printItemsInBucket(int index) {
        if (isEmpty()) {
            return;
        }

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            System.out.println(current);

            current = current.getNext();
        }
    }

    /**
     * A method to search for an {@link com.gustavson.hashtable.Entry} by a given key.
     *
     * @param key The desired key to lookup.
     * @return The entry (a Key - Value Pair) that has the given key.
     */
    public Entry<TKey, TValue> search(TKey key) {
        if (isEmpty()) {
            throw new NullPointerException("The Hash Table is empty.");
        }

        int index = getInsertIndex(key);

        if (table[index].getKey().equals(key) && table[index].getKey().hashCode() == key.hashCode()) {
            return table[index];
        }

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getKey().hashCode() == key.hashCode()) {
                return current;
            }

            current = current.getNext();
        }

        throw new IllegalArgumentException("The key of " + key + " was not found in the Hash Table.");
    }

    /**
     * A method to see if a given key is contained in the Hash Table.
     *
     * @param key The desired Key to lookup.
     * @return <b>True</b> if the given Key is found within the Hash Table.
     * <br/>
     * <b>False</b> if the given Key is not found within the Hash table.
     */
    public boolean containsKey(TKey key) {
        if (isEmpty()) {
            return false;
        }

        int index = getInsertIndex(key);

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getKey().hashCode() == key.hashCode()) {
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    /**
     * A method to see if there are entries present at a given index.
     *
     * @param index The desired index to look through.
     * @return <b>True</b> If the index contains one or more entry.
     * <br/>
     * <b>False</b> If the index does not contain any entries.
     */
    public boolean containsEntryAt(int index) {
        if (isEmpty()) {
            return false;
        }

        return table[index] != null;
    }

    /**
     * A method to update the contents of an entry.
     * <p>
     * <strong>Note</strong> this method, will only update one Entry.
     * Meaning if the user attempts to update a Entry having the Key of 1 and a Value of 100
     * and in the Hash Table there are two or more entries with the same Key and Value,
     * it will only update the first of these entries.
     * </p>
     *
     * @param key      The desired Key of a Key - Value Pair to be used to lookup for a specified value.
     * @param newValue The new value that will replace the old value in a Key - Value Pair.
     */
    public void update(TKey key, TValue newValue) {
        if (isEmpty()) {
            return;
        }

        if (!containsKey(key)) {
            return;
        }

        int index = getInsertIndex(key);

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getKey().hashCode() == key.hashCode()) {
                current.setValue(newValue);
                return;
            }

            current = current.getNext();
        }
    }

    /**
     * A method to update the contents of an entry.
     * <p>
     * <strong>Note</strong> this method, will only update one Entry.
     * Meaning if the user attempts to update a Entry having the Key of 1 and a Value of 100
     * and in the Hash Table there are two or more entries with the same Key and Value (old value),
     * it will only update the first of these entries.
     * </p>
     *
     * @param key      The desired Key of a Key - Value Pair to be used to lookup for a specified value.
     * @param oldValue The old piece of Value to be changed in a Key - Value Pair.
     * @param newValue The new value that will replace the old value in a Key - Value Pair.
     */
    public void update(TKey key, TValue oldValue, TValue newValue) {
        if (isEmpty()) {
            return;
        }

        if (!containsKey(key)) {
            return;
        }

        int index = getInsertIndex(key);

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getValue().equals(oldValue) && current.getKey().hashCode() == key.hashCode()) {
                current.setValue(newValue);
                return;
            }

            current = current.getNext();
        }
    }

    /**
     * A method to update the contents of all entries with the desired data.
     * <p>
     * <strong>Note</strong> this method, will update all entries that have the same Key.
     * Meaning if the user attempts to update a Entry having the Key of 1 and a Value of 100
     * and in the Hash Table there are two or more entries with the same Key,
     * it will update all of these matching entries (same Key).
     * </p>
     *
     * @param key      The desired Key of a Key - Value Pair to be used to lookup for a specified value.
     * @param newValue The new value that will replace the old value in a Key - Value Pair.
     */
    public void updateAll(TKey key, TValue newValue) {
        if (isEmpty()) {
            return;
        }

        if (!containsKey(key)) {
            return;
        }

        int index = getInsertIndex(key);

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getKey().hashCode() == key.hashCode()) {
                current.setValue(newValue);
            }

            current = current.getNext();
        }
    }

    /**
     * A method to update the contents of all entries with the desired data.
     * <p>
     * <strong>Note</strong> this method, will only update all entries with the same Key and Value (oldValue).
     * Meaning if the user attempts to update a Entry having the Key of 1 and a Value of 100
     * and in the Hash Table there are two or more entries with the same Key and Value,
     * it will update all of these matching entries (same Key and old Value).
     * </p>
     *
     * @param key      The desired Key of a Key - Value Pair to be used to lookup for a specified value.
     * @param oldValue The old piece of Value to be changed in a Key - Value Pair.
     * @param newValue The new value that will replace the old value in a Key - Value Pair.
     */
    public void updateAll(TKey key, TValue oldValue, TValue newValue) {
        if (isEmpty()) {
            return;
        }

        if (!containsKey(key)) {
            return;
        }

        int index = getInsertIndex(key);

        Entry<TKey, TValue> current = table[index];

        while (current != null) {
            if (current.getKey().equals(key) && current.getValue().equals(oldValue) && current.getKey().hashCode() == key.hashCode()) {
                current.setValue(newValue);
            }

            current = current.getNext();
        }
    }

    /**
     * A method to get the index of a given Key.
     *
     * @param key The desired Key to find its index within in the Hash Table.
     * @return The index (as an integer) of the given Key.
     */
    public int indexOf(TKey key) {
        if (isEmpty()) {
            throw new IllegalArgumentException("The Hash Table is empty.");
        }

        return getInsertIndex(key);
    }

    /**
     * A method to clear the entire Hash Table of it's content.
     * It will also reset whatever the capacity was before clearing the Hash Table to the default capacity of 11.
     */
    public void clear() {
        Arrays.fill(table, null);

        numberOfEntries = 0;

        capacity = DEFAULT_CAPACITY;
    }

    /**
     * A method to clear a desired bucket of all the entries.
     *
     * @param key The desired Key to remove all entries from.
     */
    public void clearBucket(TKey key) {
        if (isEmpty()) {
            return;
        }

        if (!containsKey(key)) {
            return;
        }

        int index = getInsertIndex(key);

        numberOfEntries = numberOfEntries - getNumberOfEntriesInBucket(index);

        table[index] = null;
    }

    /**
     * A method to clear a desired bucket of all the entries.
     *
     * @param index The desired index to remove all entries from.
     */
    public void clearBucket(int index) {
        if (isEmpty()) {
            return;
        }

        if (!containsEntryAt(index)) {
            return;
        }

        numberOfEntries = numberOfEntries - getNumberOfEntriesInBucket(index);

        table[index] = null;
    }

    /**
     * A private method to write logging information to a text file (the Key, Data, and what type of information will be logged).
     *
     * @param key    The Key to be logged.
     * @param value  The value to be logged.
     * @param option The type of information to be logged.
     */
    private void writeToFile(TKey key, TValue value, FileWritingOption option) {
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a MM/dd/yyyy");

        File logFile = new File("log.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            if (option.equals(FileWritingOption.PUT)) {
                writer.write("At " + currentDateAndTime.format(dateTimeFormatter) + " Time Zone = " + ZoneId.systemDefault()
                             + ", the key of " + key + " and the value of " + value + " was added at index " + indexOf(key));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * A private method to serve as the hash function. A hash functions purpose is to retrieve the index of
     * where a key should be mapped to in the Hash Table, based on its hash code (defined by the {@link Object hashCode} method).
     *
     * @param key The desired Key to be mapped into the Hash Table.
     * @return The index (as an integer) of where the key will be mapped to within the Hash Table.
     */
    private int getInsertIndex(TKey key) {
        return Math.abs(key.hashCode() % capacity);
    }

    /**
     * A method to see if the specified number (capacity) is prime or not.
     * <p>
     * A prime number is a number that is only divisible by one and itself.
     * Prime numbers for Hash Tables are important because if the capacity of the Hash table is prime it will better ensure
     * that entries are uniformly distributed and as a result entries are less likely to collide.
     * </p>
     *
     * @param number The number (capacity) that is to be tested to see if it is a prime number.
     * @return <b>True</b> if the number (capacity) is a prime number.
     * <br/>
     * <b>False</b> if the number (capacity) is not a prime number.
     */
    private boolean isPrime(int number) {
        if (number == 0 || number == 1) { // If the number is 0 or 1, we know it is prime
            return true;
        }

        if (number % 2 == 0) { // If the number is even, we know it isn't a prime number
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) { // Start at the first odd number, not one. Skip all the even numbers and go up until you reach the square root of the number
            if (number % i == 0) { // If the number modulus the current number is divisible, we know it isn't a prime number.
                return false;
            }
        }

        return true;
    }

    /**
     * A private method to find the closest prime number from the current non-prime number capacity of the Hash Table, this new prime number will be the new capacity of the Hash table.
     * <p>
     * If the method receives a non-prime capacity, it will find the nearest prime number which in this case is 5. If the method receives 38, it will return 41.
     * </p>
     *
     * @param currentCapacity A non-prime number that is the current capacity of the Hash Table.
     * @return The nearest prime number that is a larger prime number then the specified current capacity,
     * this newly found prime number will be the new capacity of the Hash Table.
     */
    private int getNextPrime(int currentCapacity) {
        while (true) { // Go forever until we find a prime number
            if (isPrime(currentCapacity)) { // If the number is prime, return that new prime number to be used as the new capacity
                return currentCapacity;
            }

            currentCapacity++; // Otherwise the previously tested number wasn't prime, test the next number to see if it is prime
        }
    }

    /**
     * A private enum to describe what type of operation performed on the Hash Table will be logged to a text file.
     */
    private enum FileWritingOption {
        /**
         * An enumeration constant to describe the put (or add) operation performed on a Hash Table.
         */
        PUT,
        /**
         * An enumeration constant to describe the removal operation performed on a Hash Table.
         */
        REMOVE,
        /**
         * An enumeration constant to describe the clearing of a bucket on a Hash Table.
         */
        CLEAR_BUCKET
    }
}
