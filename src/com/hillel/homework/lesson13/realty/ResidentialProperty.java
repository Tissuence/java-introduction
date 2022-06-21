package com.hillel.homework.lesson13.realty;

public class ResidentialProperty extends Realty {

    double subsidyInterestRate;

    public ResidentialProperty(double area, double subsidyInterestRate, String name) {
        super(area, name);
        this.subsidyInterestRate = subsidyInterestRate;
    }

    public double calculateTax() {
        return super.calculateTax() * (100 - subsidyInterestRate) / 100;
    }
}
