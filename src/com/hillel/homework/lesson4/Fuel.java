package com.hillel.homework.lesson4;

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity of fuel, distance: ");
        int fuel = scanner.nextInt();
        int distance = scanner.nextInt();

        double fuelConsumption = calculateFuelConsumption(fuel, distance);

        System.out.println("Fuel consumption per 100 km: " + Math.round(fuelConsumption) + " l/100 km");


    }

    public static double calculateFuelConsumption(int fuel, int distance) {
        return (double) fuel / distance * 100;
    }
}
