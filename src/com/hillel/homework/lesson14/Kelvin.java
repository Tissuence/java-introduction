package com.hillel.homework.lesson14;

public class Kelvin implements Convertible {
String name;
    public Kelvin(String name) {
    }

    @Override
    public double convert(double degrees) {
        return degrees + 273.15;
    }
}
