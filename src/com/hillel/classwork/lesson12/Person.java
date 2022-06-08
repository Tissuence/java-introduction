package com.hillel.classwork.lesson12;

import java.net.PortUnreachableException;

public class Person {

    public static final String DEFAULT_NAME = "Unknown";
  public static int COUNT = 0;


    private final String name;
    private int age;

    public Person(int age) {
        this.name = DEFAULT_NAME;
        this.age = age;
        COUNT++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        COUNT++;

        secretAction();
    }

    public String getName() {

        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name = '" + name + '\'' +
                ", age = " + age;
    }

    private void secretAction() {
        System.out.println("secret action");
        System.out.println(this.name);
    }
}
