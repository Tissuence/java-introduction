package com.hillel.homework.lesson13.realty;

public class RetailProperty extends Realty {
    protected int taxableRevenueBottomLine;
    double revenue;

    public RetailProperty(double area, double revenue, int taxableRevenueBottomLine, double defaultTaxRatePerOneSquareMeter, String name) {
        super(area, name, defaultTaxRatePerOneSquareMeter);
        this.revenue = revenue;
        this.taxableRevenueBottomLine = taxableRevenueBottomLine;
    }

    public double calculateTax() {
        if (revenue > taxableRevenueBottomLine) {
            return super.calculateTax();
        }
        return 0.0;
    }
}
