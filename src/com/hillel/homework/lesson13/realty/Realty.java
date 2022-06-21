package com.hillel.homework.lesson13.realty;

public class Realty {

    protected double area;
    protected static double DEFAULT_TAX_RATE_PER_ONE_SQUARE_METER = 43.5;

    protected Realty(double area) {
        this.area = area;
    }

    public double calculateTax() {
        double calculatedTax = this.area * DEFAULT_TAX_RATE_PER_ONE_SQUARE_METER;
        return calculatedTax;
    }
}
