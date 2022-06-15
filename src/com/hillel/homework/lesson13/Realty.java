package com.hillel.homework.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Realty {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    protected double area;
    protected static double DEFAULT_TAX_RATE_PER_ONE_SQUARE_METER = 43.5;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    protected Realty() {
        double area = readFromConsole();
        this.area = area;
    }

    protected double readFromConsole() {
        double inputFromConsole = 0;
        try {
           inputFromConsole = Double.parseDouble(READER.readLine());
        } catch (RuntimeException | IOException e) {
            System.out.println("Incorrect data inputFromConsole!");
            readFromConsole();
        } return inputFromConsole;
    }

        public void printCalculatedTax () throws IOException {
            System.out.println("Amount of tax payable: " + decimalFormat.format(calculateTax()) + " uah");
        }

        protected double calculateTax () throws IOException {
            double calculatedTax = this.area * DEFAULT_TAX_RATE_PER_ONE_SQUARE_METER;
            return calculatedTax;
        }
}
