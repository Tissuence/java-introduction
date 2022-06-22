package com.hillel.homework.lesson14;

public abstract class Degrees implements Converter {
    protected double degrees;
    String name;

    public Degrees(double degrees, String name) {
        this.degrees = degrees;
        this.name = name;
    }

    @Override
    public double convert() {
        return degrees;
    }
}
