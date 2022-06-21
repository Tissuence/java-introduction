package com.hillel.homework.lesson13.realty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RealtyMain {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<Realty> allRealty = new ArrayList<>();
        System.out.println("Input your subsidy interest rate:");
        double subsidy = Integer.parseInt(READER.readLine());
        System.out.println("Input your revenue volume:");
        double revenue = Integer.parseInt(READER.readLine());
        System.out.println("Input your Taxable revenue bottom line:");
        int taxableRevenueBottomLine =  Integer.parseInt(READER.readLine());

        allRealty.add(new ResidentialProperty(readFromConsole(), subsidy, "Residential Property"));
        allRealty.add(new RetailProperty(readFromConsole(), revenue, taxableRevenueBottomLine,"Retail Property"));
        allRealty.add(new ProductionProperty(readFromConsole(), "Production Property"));

        printAllCalculatedTaxes(allRealty);
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

    private static void printAllCalculatedTaxes(ArrayList<Realty> allRealty) {
        for (Realty realty : allRealty) {
            System.out.println("Amount of tax payable: " + realty.getName() + " = " + realty.calculateTax() + " uah");
        }
    }
}
