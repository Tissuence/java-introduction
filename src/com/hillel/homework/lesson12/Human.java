package com.hillel.homework.lesson12;

public class Human {
    private final String status;
    private final String name;
    private final int age;
    private Human mom;
    private Human dad;


    public Human(String status, String name, int age, Human mom, Human dad) {
        this.status = status;
        this.name = name;
        this.age = age;
        this.mom = mom;
        this.dad = dad;
    }

    public Human(String status, String name, int age) {
        this.status = status;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (this.mom != null && this.dad != null) {
            return "Status: " + status + "\n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Mom: " + mom.getName() + "\n" +
                    "Dad: " + dad.getName() + "\n" + "\n";
        } else {
            return "Status: " + status + "\n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" + "\n";
        }
    }
}