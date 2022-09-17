package com.gustavson;

import com.gustavson.hashtable.HashTable;
import com.gustavson.person.Gender;
import com.gustavson.person.Person;
import com.gustavson.planet.Moon;
import com.gustavson.planet.Planet;

import java.util.*;

public class Main {
    public static String toRomanNumeral(int number) {
        if (number <= 0) {
            return "Error: " + number + " cannot be converted to a Roman Numeral.";
        }

        StringBuilder convertedNumber = new StringBuilder();

        while (number != 0) {
            if (number >= 1000) {
                number = number - 1000;

                convertedNumber.append('M');
            } else if (number >= 900) {
                number = number - 900;

                convertedNumber.append("CM");
            } else if (number >= 500) {
                number = number - 500;

                convertedNumber.append('D');
            } else if (number >= 400) {
                number = number - 400;

                convertedNumber.append("CD");
            } else if (number >= 100) {
                number = number - 100;

                convertedNumber.append('C');
            } else if (number >= 90) {
                number = number - 90;

                convertedNumber.append("XC");
            } else if (number >= 50) {
                number = number - 50;

                convertedNumber.append('L');
            } else if (number >= 40) {
                number = number - 40;

                convertedNumber.append("XL");
            } else if (number >= 10) {
                number = number - 10;

                convertedNumber.append('X');
            } else if (number >= 9) {
                number = number - 9;

                convertedNumber.append("IX");
            } else if (number >= 5) {
                number = number - 5;

                convertedNumber.append('V');
            } else if (number == 4) {
                number = number - 4;

                convertedNumber.append("IV");
            } else if (number >= 1) {
                number = number - 1;

                convertedNumber.append('I');
            }
        }

        return convertedNumber.toString();
    }

    public static int fromRomanNumeralToInteger(String romanNumeral) {
        if (romanNumeral.length() == 0) {
            return 0;
        }

        int convertedRomanNumeral = 0;

        Map<Character, Integer> romanNumeralsChart = new HashMap<>();
        romanNumeralsChart.put('I', 1);
        romanNumeralsChart.put('V', 5);
        romanNumeralsChart.put('X', 10);
        romanNumeralsChart.put('L', 50);
        romanNumeralsChart.put('C', 100);
        romanNumeralsChart.put('D', 500);
        romanNumeralsChart.put('M', 1000);

        for (int i = 0; i < romanNumeral.length() - 1; i++) {
            if (romanNumeralsChart.get(romanNumeral.charAt(i)) >= romanNumeralsChart.get(romanNumeral.charAt(i + 1))) {
                convertedRomanNumeral = convertedRomanNumeral + romanNumeralsChart.get(romanNumeral.charAt(i));
            } else {
                convertedRomanNumeral = convertedRomanNumeral - romanNumeralsChart.get(romanNumeral.charAt(i));
            }
        }

        convertedRomanNumeral = convertedRomanNumeral + romanNumeralsChart.get(romanNumeral.charAt(romanNumeral.length() - 1));

        return convertedRomanNumeral;
    }

    public static boolean isPangram(String text) {
        text = text.replaceAll("\\s+", "");
        text = text.toLowerCase();

        boolean[] lettersPresent = new boolean[26];

        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i) - 'a';

            lettersPresent[index] = true;
        }

        for (boolean letter : lettersPresent) {
            if (letter == false) {
                return false;
            }
        }

        return true;
    }

    public static boolean containsOnlyNumericCharacters(String text) {
        text = text.replaceAll("\\s+", "");

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> getKClosestElements(List<Integer> numbers, int k, int target) {
        // k = the number of numbers that are closest to the target

        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .toList();

        int start = 0;
        int end = numbers.size() - 1;

        while (end - start >= k) {
            if (Math.abs(sortedNumbers.get(start) - target) > Math.abs(sortedNumbers.get(end)) - target) {
                start++;
            } else {
                end--;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            result.add(sortedNumbers.get(i));
        }

        return result;
    }

    public static String capitalize(String word) {
        StringBuilder convertedWord = new StringBuilder(word);

        if (Character.isLowerCase(convertedWord.charAt(0))) {
            convertedWord.setCharAt(0, Character.toUpperCase(convertedWord.charAt(0)));
        }

        return convertedWord.toString();
    }

    public static String capitalizeAllWords(String word) {
        word = word.replaceAll("\\s+", " ");
        StringBuilder convertedWord = new StringBuilder(word);

        if (Character.isLowerCase(convertedWord.charAt(0))) {
            convertedWord.setCharAt(0, Character.toUpperCase(convertedWord.charAt(0)));
        }

        for (int i = 1; i < word.length(); i++) {
            if (convertedWord.charAt(i - 1) == ' ') {
                if (Character.isLowerCase(convertedWord.charAt(i))) {
                    convertedWord.setCharAt(i, Character.toUpperCase(convertedWord.charAt(i)));
                }
            }
        }

        return convertedWord.toString();
    }

    public static String toProperCasing(String phrase) {
        StringBuilder convertedPhrase = new StringBuilder();

        phrase = phrase.toLowerCase();

        phrase = phrase.replaceAll("\\s+", " "); // replace all whitespace with just a single space

        convertedPhrase.append(Character.toUpperCase(phrase.charAt(0))); // set the first character to be uppercase because no matter what, it must be upper case

        for (int i = 1; i < phrase.length(); i++) { // since we have converted the first letter to uppercase, we can move on to the next character
            if (phrase.charAt(i - 1) == ' ') { // if the prior character is a space, we know that it is a new word and the letter must be capitalized
                convertedPhrase.append(Character.toUpperCase(phrase.charAt(i))); // capitalize the letter that is directly after the space
            } else { // if it isn't a character that is directly after a space, just add that character to the word
                convertedPhrase.append(phrase.charAt(i));
            }
        }

        return convertedPhrase.toString();
    }

    public static String mostCommonWord(String sentence) {
        sentence = sentence.replaceAll("\\W+", " ");

        sentence = sentence.toLowerCase();

        String[] wordsOnly = sentence.split(" ");

        // Key = The Word, Value = The # of occurrences of the word
        Map<String, Integer> histogram = new HashMap<>();

        for (String word : wordsOnly) {
            histogram.put(word, histogram.getOrDefault(word, 0) + 1);
        }

        int max = 0;
        String mostCommonWord = "";

        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            if (entry.getValue() > max) { // if the # of times the word appears is greater than the max, update the max and the word with that appears the most frequently
                max = entry.getValue();
                mostCommonWord = entry.getKey();
            }
        }

        if (max == 1) {
            return "No found words were repeated.";
        }

        return mostCommonWord;
    }

    public static String mostCommonCharacter(String word) {
        // Key = Character (the letter), Value = Integer (the number of occurrences of the letter)
        Map<Character, Integer> histogram = new HashMap<>();

        // word = word.toLowerCase(); Uncomment this line of code out to make the search not assume case sensitivity

        word = word.replaceAll("\\s+", "");

        for (char character : word.toCharArray()) {
            histogram.put(character, histogram.getOrDefault(character, 0) + 1);
        }

        String mostCommonCharacter = "";

        int max = 0;

        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            if (entry.getValue() > max) { // if the # of occurrences of a character is greater than the max, update the max and the character with the most amount of occurrences
                max = entry.getValue();
                mostCommonCharacter = Character.toString(entry.getKey());
            }
        }

        if (max == 0 || max == 1) {
            return "No repeating characters.";
        }

        return mostCommonCharacter;
    }

    public static char mostCommonCharacter2(String word) {
        // Key = the Character (the letter), Value = Integer (the number of occurrences of the letter)
        Map<Character, Integer> histogram = new HashMap<>();

        word = word.replaceAll("\\s+", "");

        // word = word.toLowerCase(); Uncomment this line of code out to make the search not assume case sensitivity

        for (char character : word.toCharArray()) {
            histogram.put(character, histogram.getOrDefault(character, 0) + 1);
        }

        char maxCharacter = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            if (entry.getValue() > max) { // if the # of occurrences is greater than the current max, update the max and the character that has the most occurrences
                max = entry.getValue();
                maxCharacter = entry.getKey();
            }
        }

        if (max == 1) {
            return ' ';
        }

        return maxCharacter;
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> nonDuplicatesList = new ArrayList<>();

        for (int number : array) {
            if (!set.contains(number)) {
                set.add(number);
                nonDuplicatesList.add(number);
            }
        }

        int[] resultArray = new int[nonDuplicatesList.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = nonDuplicatesList.get(i);
        }

        return resultArray;
    }

    public static String removeDuplicates(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> histogram = new LinkedHashMap<>();

        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            histogram.put(character, histogram.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            result.append(entry.getKey());
        }

        return result.toString();
    }

    public static String[] getAllWords(String text) {
        text = text.replaceAll("\\s+", " ");
        text = text.replaceAll("[.,!@#$%^&*()_=|{}~`?<>]", "");

        return text.split(" ");
    }

    public static String leastCommonCharacter(String word) {
        Map<Character, Integer> histogram = new HashMap<>();

        for (char character : word.toCharArray()) {
            histogram.put(character, histogram.getOrDefault(character, 0) + 1);
        }

        String minimumRepeatingCharacter = "";
        int minimum = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            if (entry.getValue() < minimum && entry.getValue() > 1) { // if the # of occurrences is less than the current min and that the letter appears more than once, update the # of occurrences for the letter and update the character that occurs the least
                minimum = entry.getValue();

                minimumRepeatingCharacter = Character.toString(entry.getKey());
            }
        }

        if (minimum == Integer.MAX_VALUE) {
            return "No minimum repeating character was found";
        }

        return minimumRepeatingCharacter;
    }

    public static String caesarCipher(String plainText, int shift) {
        StringBuilder codedText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char currentCharacter = plainText.charAt(i);

            if (Character.isLetter(currentCharacter)) {
                if (Character.isLowerCase(currentCharacter)) {
                    char convertedCharacter = (char) (currentCharacter + shift);
                    if (convertedCharacter > 'z') {
                        codedText.append((char) (currentCharacter - (26 - shift)));
                    } else {
                        codedText.append(convertedCharacter);
                    }
                } else if (Character.isUpperCase(currentCharacter)) {
                    char convertedCharacter = (char) (currentCharacter + shift);
                    if (convertedCharacter > 'Z') {
                        codedText.append((char) (currentCharacter - (26 - shift)));
                    } else {
                        codedText.append(convertedCharacter);
                    }
                } else {
                    codedText.append(currentCharacter);
                }
            }
        }

        return codedText.toString();
    }

    public static void main(String[] args) {

        HashTable<Integer, Integer> testHashTable = new HashTable<>(6);
        testHashTable.put(1, 1);
        testHashTable.put(1, 1);
        System.out.println(testHashTable.getNumberOfEntries());
        testHashTable.printTable();

        System.out.println();
        System.out.println();
        int number = 1999;
        String resultToRomanNumeral = toRomanNumeral(number);
        System.out.println(resultToRomanNumeral);
        System.out.println(fromRomanNumeralToInteger(resultToRomanNumeral));

        HashTable<Integer, Integer> numbers = new HashTable<>();
        numbers.put(1, 100);
        System.out.println("numbers.containsKey(1) = " + numbers.containsKey(1));
        numbers.put(2, 200);
        numbers.put(3, 300);
        numbers.putIfAbsent(4, 400);
        numbers.printTable();

        Person aaronJudge = new Person("Aaron", "Judge", 30, Gender.MALE);
        Person gerritCole = new Person("Gerrit", "Cole", 31, Gender.MALE);
        Person whiteFord = new Person("White", "Ford", 91, Gender.MALE);
        Person yogiBerra = new Person("Yogi", "Berra", 90, Gender.MALE);
        Person anthonyRizzo = new Person("Anthony", "Rizzo", 33, Gender.MALE);

        Person matBarzal = new Person("Mat", "Barzal", 25, Gender.MALE);
        Person ilyaSorokin = new Person("Ilya", "Sorokin", 27, Gender.MALE);
        Person noahDobson = new Person("Noah", "Dobson", 22, Gender.MALE);

        List<Moon> moons = Arrays.asList(Moon.values());
        List<Planet> planets = Arrays.asList(Planet.values());

        List<Moon> mercuryMoons = Planet.MERCURY.getMoons();
        List<Moon> venusMoons = Planet.VENUS.getMoons();
        List<Moon> earthMoons = Planet.EARTH.getMoons();
        List<Moon> marsMoons = Planet.MARS.getMoons();
        List<Moon> jupiterMoons = Planet.JUPITER.getMoons();
        List<Moon> saturnMoons = Planet.SATURN.getMoons();
        List<Moon> uranusMoons = Planet.URANUS.getMoons();
        List<Moon> neptuneMoons = Planet.NEPTUNE.getMoons();
        List<Moon> plutoMoons = Planet.PLUTO.getMoons();

        System.out.println(mercuryMoons);
        System.out.println(venusMoons);
        System.out.println(earthMoons);
        System.out.println(marsMoons);
        System.out.println(jupiterMoons);
        System.out.println(saturnMoons);
        System.out.println(uranusMoons);
        System.out.println(neptuneMoons);
        System.out.println(plutoMoons);

    }
}
