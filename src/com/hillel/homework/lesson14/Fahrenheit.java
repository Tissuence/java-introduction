package com.hillel.homework.lesson14;

public class Fahrenheit extends Degrees {

    public Fahrenheit(double degrees, String name) {
        super(degrees, name);
    }

    @Override
    public double convert() {
        return super.convert() * 9 / 5 + 32;
    }
}
