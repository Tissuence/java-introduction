package com.hillel.homework.lesson12;

public class Person {

    private final String name;
    private final String surname;
    private final int age;
    private final int weight;
    private final int height;

    public static String[] NAME_POOL = new String[] {"Paolo", "Nick", "Jack", "Fernando", "Roberto", "Mike", "John", "Nikolas"};
    public static String[] SURNAME_POOL = new String[] {"Jackson", "Wilson", "Dimopulas", "Vens", "Gamilton", "Brown", "Depp", "Jolie"};

    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person name: " + name  +
                ", surname: " + surname +
                ", age: " + age +
                ", weight: " + weight + " kg" +
                " , height: " + height +
                " сm";
    }

    public static Person[] makePoolOfPerson(String[] namePool, String[] surnamePool) {
        int minAge = 18;
        int maxAge = 90;
        int minWeight = 50;
        int maxWeight = 150;
        int minHeight = 155;
        int maxHeight = 200;
        Person[] persons = new Person[100];

        for (int i = 0; i < 100; i++) {
            String name = namePool[(int) (Math.random() * 8)];
            String surname = surnamePool[(int) (Math.random() * 8)];
            int age = (int) (Math.random() * (maxAge - minAge) + minAge);
            int weight = (int) (Math.random() * (maxWeight - minWeight) + minWeight);
            int height = (int) (Math.random() * (maxHeight - minHeight) + minHeight);
            Person person = new Person(name, surname, age, weight, height);
            persons[i] = person;
        }
        return persons;
    }
}
