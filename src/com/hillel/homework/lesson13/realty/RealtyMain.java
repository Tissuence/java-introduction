package com.hillel.homework.lesson13.realty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealtyMain {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input your subsidy interest rate:");
        double subsidy = Integer.parseInt(READER.readLine());
        Realty residentialProperty = new ResidentialProperty(readFromConsole(), subsidy);
        System.out.println("Amount of tax payable: " + residentialProperty.calculateTax() + " uah");

        System.out.println("Input your revenue volume:");
        double revenue = Integer.parseInt(READER.readLine());
        Realty retailProperty = new RetailProperty(readFromConsole(), revenue);
        System.out.println("Amount of tax payable: " + retailProperty.calculateTax() + " uah");

        Realty productionProperty = new ProductionProperty(readFromConsole());
        System.out.println("Amount of tax payable: " + productionProperty.calculateTax() + " uah");
    }

    public static double readFromConsole() {
        double inputFromConsole = 0;
        System.out.println("Input area of your property:");
        try {
            inputFromConsole = Double.parseDouble(READER.readLine());
        } catch (RuntimeException | IOException e) {
            System.out.println("Incorrect data inputFromConsole!");
            readFromConsole();
        }
        return inputFromConsole;
    }
}
