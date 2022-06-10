package com.hillel.homework.lesson12;

public class PersonMain {

    public static void main(String[] args) {

        Person[] poolOfPersons = Person.makePoolOfPerson();
        printArray(poolOfPersons);
    }

    private static void printArray(Person[] persons) {
        for (int i = 0; i < 100; i++) {
            System.out.println(persons[i]);
            System.out.println();
        }
    }
}
