package com.hillel.homework.lesson13;

import java.io.IOException;


public class ResidentialProperty extends Realty {
    private static final double SUBSIDY_INTEREST_RATE = 20.8;

    public ResidentialProperty() {
        super();
    }

    public double readFromConsole()  {
        System.out.println("Enter the area of residential property in m" + '\u00B2' + ":");
        return super.readFromConsole();
    }

    public double calculateTax() throws IOException {
        return super.calculateTax() * (100 - SUBSIDY_INTEREST_RATE) / 100;
    }
}
