package com.hillel.homework.lesson13.realty;

public class Realty {

    protected double area;
    protected String name;
    protected double defaultTaxRatePerOneSquareMeter;

    protected Realty(double area, String name, double defaultTaxRatePerOneSquareMeter ) {
        this.area = area;
        this.name = name;
        this.defaultTaxRatePerOneSquareMeter = defaultTaxRatePerOneSquareMeter;
    }

    public double calculateTax() {
        double calculatedTax = this.area * defaultTaxRatePerOneSquareMeter;
        return calculatedTax;
    }

    public String getName() {
        return name;
    }
}
