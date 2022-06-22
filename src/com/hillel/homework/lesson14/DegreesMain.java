package com.hillel.homework.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class DegreesMain {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        do {
            System.out.println("Enter degrees Celsius value:");
            double degrees = Double.parseDouble(READER.readLine());
            System.out.println("Enter type of temperature measurement system (Fahrenheit, Kelvin):");
            String name = READER.readLine();

            DegreesType type = DegreesType.valueOf(name);
            Degrees currentDegreeType = createDegreeType(type, degrees);
            String convertedDegrees = roundValue(currentDegreeType.convert());

            System.out.println(degrees + " Celsius = " + convertedDegrees + " " + name);

            System.out.println("Do you want to continue converting? Yes or no");
        } while (!(READER.readLine().equalsIgnoreCase("no")));
    }

    private static Degrees createDegreeType(DegreesType type, double degrees) {
        Degrees degreesType = null;
        switch (type) {
            case Fahrenheit -> degreesType = new Fahrenheit(degrees, "Fahrenheit");
            case Kelvin -> degreesType = new Kelvin(degrees, "Kelvin");
        }

        return degreesType;
    }

    public static String roundValue(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }

    enum DegreesType {
        Fahrenheit, Kelvin
    }
}
