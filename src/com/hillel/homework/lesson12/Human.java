package com.hillel.homework.lesson12;

public class Human {
    private final String status;
    private final String name;
    private final int age;

    public Human(String status, String name, int age) {
        this.status = status;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Status: " + status + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" + "\n";
    }
}
