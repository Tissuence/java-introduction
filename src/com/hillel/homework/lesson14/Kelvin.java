package com.hillel.homework.lesson14;

public class Kelvin extends Degrees {

    public Kelvin(double degrees, String name) {
        super(degrees, name);
    }

    @Override
    public double convert() {
        return super.convert() + 273.15;
    }
}
