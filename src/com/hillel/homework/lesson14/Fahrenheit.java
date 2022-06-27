package com.hillel.homework.lesson14;

public class Fahrenheit implements Convertible {

    public Fahrenheit(String name) {
    }

    @Override
    public double convert(double degrees) {
        return degrees * 9 / 5 + 32;
    }
}
