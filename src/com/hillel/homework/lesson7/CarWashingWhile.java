package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWashingWhile {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" How much cars we have today? Write down: ");
        int quantityOfTheCars = Integer.parseInt(reader.readLine());

        if (quantityOfTheCars <= 0) {
            System.out.println("Incorrect data!");

        }
        while (quantityOfTheCars != 0) {
            quantityOfTheCars--;
            soapCar(quantityOfTheCars);
            washCar(quantityOfTheCars);
            dryCar(quantityOfTheCars);

        }
    }

    public static void soapCar(int quantityOfTheCars) {
        System.out.println(" Wow, " + (quantityOfTheCars + 1) + " car successfully soaped!");
    }

    public static void washCar(int quantityOfTheCars) {
        System.out.println(" Okay, " + (quantityOfTheCars + 1) + " car successfully washed!");
    }

    public static void dryCar(int quantityOfTheCars) {
        System.out.println(" Great, " + (quantityOfTheCars + 1) + " car successfully dried!");
    }

}
