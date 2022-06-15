package com.hillel.classwork.lesson13;

public class Animal {

   protected String color;
    public static String DEFAULT_COLOR = "white";
    public Animal(String color) {
        this.color = color;
    }

    public void speak() {
        System.out.println("animal speaks");
    }
}
