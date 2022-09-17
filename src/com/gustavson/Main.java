package com.gustavson;

import com.gustavson.hashtable.HashTable;
import com.gustavson.person.Gender;
import com.gustavson.person.Person;
import com.gustavson.planet.Moon;
import com.gustavson.planet.Planet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, Integer> testHashTable = new HashTable<>(6);
        testHashTable.put(1, 1);
        testHashTable.put(1, 1);
        System.out.println(testHashTable.getNumberOfEntries());
        testHashTable.printTable();

        System.out.println();
        System.out.println();

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
