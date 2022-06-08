package com.hillel.homework.lesson12;

import java.util.Arrays;

public class PersonMain {

    public static String[] namePool = new String[] {"Paolo", "Nick", "Jack", "Fernando", "Roberto", "Mike", "John", "Nikolas"};
    public static String[] surnamePool = new String[] {"Jackson", "Wilson", "Dimopulas", "Vens", "Gamilton", "Brown", "Depp", "Jolie"};

    public static void main(String[] args) {

        Person[] poolOfPersons = Person.makePoolOfPerson(namePool, surnamePool);
        printArray(poolOfPersons);
    }

    private static void printArray(Person[] persons) {
        for (int i = 0; i < 100; i++) {
            System.out.println(persons[i]);
            System.out.println();
        }
    }
}
