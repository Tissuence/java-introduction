package com.hillel.homework.lesson12;

import static com.hillel.homework.lesson12.Person.NAME_POOL;
import static com.hillel.homework.lesson12.Person.SURNAME_POOL;

public class PersonMain {

    public static void main(String[] args) {

        Person[] poolOfPersons = Person.makePoolOfPerson(NAME_POOL, SURNAME_POOL);
        printArray(poolOfPersons);
    }

    private static void printArray(Person[] persons) {
        for (int i = 0; i < 100; i++) {
            System.out.println(persons[i]);
            System.out.println();
        }
    }
}
