package com.hillel.homework.lesson13.Realty;

import java.io.IOException;

public class RetailProperty extends Realty {
    private static int TAXABLE_REVENUE_BOTTOM_LINE = 100;

    public RetailProperty() {
        super();
    }

    protected double readFromConsole()  {
        System.out.println("Enter the area of retail property in m" + '\u00B2' + ":");
        return super.readFromConsole();
    }

    protected double readRevenueFromConsole() throws IOException {
        System.out.println("Enter your revenue:");
        return super.readFromConsole();
    }

        public double calculateTax() throws IOException {
            double revenue = readRevenueFromConsole();
            if (revenue > TAXABLE_REVENUE_BOTTOM_LINE) {
                return super.calculateTax();
            }
            return 0.0;
        }
    }
