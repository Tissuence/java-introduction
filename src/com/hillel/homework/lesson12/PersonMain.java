package com.hillel.homework.lesson12;

public class PersonMain {

    public static String[] NAME_POOL = new String[] {"Paolo", "Nick", "Jack", "Fernando", "Roberto", "Mike", "John", "Nikolas"};
    public static String[] SURNAME_POOL = new String[] {"Jackson", "Wilson", "Dimopulas", "Vens", "Gamilton", "Brown", "Depp", "Jolie"};

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
