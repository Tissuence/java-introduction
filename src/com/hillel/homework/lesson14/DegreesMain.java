package com.hillel.homework.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;

public class DegreesMain {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        do {
            System.out.println("Enter degrees Celsius value:");
            double degrees = Double.parseDouble(READER.readLine());
            System.out.println("Enter type of temperature measurement system (Fahrenheit, Kelvin):");
            String name = READER.readLine().toUpperCase(Locale.ROOT);

            DegreesType type = DegreesType.valueOf(name);
            Convertible currentDegreeType = createDegreeType(type);
            String convertedDegrees = formatValue(currentDegreeType.convert(degrees));

            System.out.println(degrees + " Celsius = " + convertedDegrees + " " + name.toLowerCase());

            System.out.println("Do you want to continue converting? Yes or no");
        } while (!(READER.readLine().equalsIgnoreCase("no")));
    }

    private static Convertible createDegreeType(DegreesType type) {
        Convertible convertible = null;
        switch (type) {
            case FAHRENHEIT -> convertible = new Fahrenheit( "Fahrenheit");
            case KELVIN -> convertible = new Kelvin("Kelvin");
        }

        return convertible;
    }

    public static String formatValue(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }

}
