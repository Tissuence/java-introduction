package com.hillel.homework.lesson13.realty;

import java.io.IOException;

public class RetailProperty extends Realty {
    private static int TAXABLE_REVENUE_BOTTOM_LINE = 100;
    double revenue;

    public RetailProperty(double area, double revenue) {
        super(area);
        this.revenue = revenue;
    }

        public double calculateTax() {
            if (revenue > TAXABLE_REVENUE_BOTTOM_LINE) {
                return super.calculateTax();
            }
            return 0.0;
        }
    }
