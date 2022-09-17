package com.gustavson.hashtable;

import java.util.Objects;

/**
 * A class to represent an entry within a Hash Table. This entry will contain a Key - Value component, which together form a Key - Value Pair.
 * <br/>
 * <br/>
 * <p>
 * See {@link com.gustavson.hashtable.HashTable} to see how Entries are used within a Hash Table.
 * </p>
 *
 * @param <TKey>   The type of Key to be stored within a Key - Value Pair, which will then later be used as the types of keys to be stored with the Hash Table.
 * @param <TValue> The type of Data to be stored within a Key - Value Pair, which will then later be used as the types of data to be stored with the Hash Table.
 */
public class Entry<TKey, TValue> {
    /**
     * A private final field to represent the Key of a Key - Value Pair.
     */
    private final TKey key;

    /**
     * A private field to represent the Data of a Key - Value Pair.
     */
    private TValue value;

    /**
     * A private field to represent the link to the next node in the sequence.
     */
    private Entry<TKey, TValue> next;

    /**
     * A private field to represent the link to the previous node in the sequence.
     */
    private Entry<TKey, TValue> previous;

    /**
     * A constructor to set the Key and Data components of a Key - Value Pair to the desired values.
     *
     * @param key   The desired Key to be stored in a Key - Value Pair.
     * @param value The desired Data to be stored in a Key - Value Pair.
     */
    public Entry(TKey key, TValue value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    /**
     * A default constructor to apply default values to the Key, Value, next, and previous fields.
     */
    public Entry() {
        this.key = null;
        this.value = null;
        this.next = null;
        this.previous = null;
    }

    /**
     * A method to retrieve the Key of a Key - Value Pair.
     *
     * @return The Key of a Key - Value Pair.
     */
    public TKey getKey() {
        return this.key;
    }

    /**
     * A method to retrieve the Data of a Key - Value Pair.
     *
     * @return The Data component of a Key - Value Pair.
     */
    public TValue getValue() {
        return this.value;
    }

    /**
     * A method to retrieve the "next" element in the chain.
     *
     * @return The "next" element in the chain.
     */
    public Entry<TKey, TValue> getNext() {
        return this.next;
    }

    /**
     * A method to retrieve the "previous" element in the chain.
     *
     * @return The "previous" element in the chain.
     */
    public Entry<TKey, TValue> getPrevious() {
        return this.previous;
    }

    /**
     * A method to set the Data component of a Key - Value Pair.
     *
     * @param value The desired Data to be made the Data component of a Key - Value Pair.
     */
    public void setValue(TValue value) {
        this.value = value;
    }

    /**
     * A method to set the "next" element in the chain.
     *
     * @param next The desired "next" element in the chain.
     */
    public void setNext(Entry<TKey, TValue> next) {
        this.next = next;
    }

    /**
     * A method to set the "previous" element in the chain.
     *
     * @param previous The desired "previous" element in the chain.
     */
    public void setPrevious(Entry<TKey, TValue> previous) {
        this.previous = previous;
    }

    /**
     * An overridden method from the Object class {@link Object toString} to create a string representation an Entry object.
     *
     * @return The string representation of an Entry object.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " { "
               + "key = " + key
               + ", value = " + value
               + " } ";
    }

    /**
     * An overridden method from the Object class {@link Object equals} to compare for value based equality of an Entry (Key and Value).
     * <p>
     * Under one of the following conditions, the method will return true.
     * </p>
     *
     * <ul>
     *     <li>
     *            If the two objects are referencing the same object (reference based equality), by using the == operator.
     *     </li>
     *     <li>
     *            If the two objects values are the same according to the values stored in each Entry (same Key and Value for both Entries).
     *     </li>
     * </ul>
     *
     * @param obj The object to be compared to another Entry object.
     * @return <b>True</b> if the objects (Entry objects) are equivalent (Same Key and Value or if they are the referencing the same object) and both Entries being non-null.
     * <br/>
     * <b>False</b> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Entry<?, ?> otherEntry = (Entry<?, ?>) obj;

        if (key == null || otherEntry.getKey() == null) {
            return false;
        }

        return Objects.equals(key, otherEntry.key) && Objects.equals(value, otherEntry.value);
    }

    /**
     * An overridden method from the Object class {@link Object hashCode} to generate a hashCode to be used for hashing
     * in Data Structures that use Hashing as an integral part of the Data Structure.
     *
     * @return An int to represent the hash code of an Entry object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
