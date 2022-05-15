package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWashingFor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" How much cars we have today? Write down: ");
        int quantityOfTheCars = Integer.parseInt(reader.readLine());

        if (quantityOfTheCars <= 0) {
            System.out.println("Incorrect data!");

        }
        soapCar(quantityOfTheCars);
        washCar(quantityOfTheCars);
        dryCar(quantityOfTheCars);

    }

    public static void soapCar(int quantityOfTheCars) {
        int i;
        for (i = 1; i <= quantityOfTheCars; i++) {
            System.out.println(" Wow, " + i + " cars successfully soaped!");
        }
    }

    public static void washCar(int quantityOfTheCars) {
        int i;
        for (i = 1; i <= quantityOfTheCars; i++) {
            System.out.println(" Okay, " + i + " cars successfully washed!");
        }
    }

    public static void dryCar(int quantityOfTheCars) {
        int i;
        for (i = 1; i <= quantityOfTheCars; i++) {
            System.out.println(" Great, " + i + " cars successfully dried!");
        }
    }

}