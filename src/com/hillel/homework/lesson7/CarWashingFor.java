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

        for (int i = 0; i <= quantityOfTheCars; i++) {

            soapCar(quantityOfTheCars, i);
            washCar(quantityOfTheCars, i);
            dryCar(quantityOfTheCars, i);

        }

        System.out.println("Already washed all cars!");

    }

    public static void soapCar(int quantityOfTheCars, int numberOfCar) {
        System.out.println(" Wow, " + numberOfCar + " car successfully soaped!");
    }

    public static void washCar(int quantityOfTheCars, int numberOfCar) {
        System.out.println(" Okay, " + numberOfCar + " car successfully washed!");
    }

    public static void dryCar(int quantityOfTheCars, int numberOfCar) {
        System.out.println(" Great, " + numberOfCar + " car successfully dried!");
    }

}