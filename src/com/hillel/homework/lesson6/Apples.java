package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quantity of apples:");
        int apples = Integer.parseInt(reader.readLine());

        int capacityBigJar = 5;
        int capacityMediumJar = 3;
        int capacitySmallJar = 1;

        int restApplesAfterBigJar = restOfApples(apples, capacityBigJar);
        int restApplesAfterBMediumJar = restOfApples(restApplesAfterBigJar, capacityMediumJar);

        if (apples <= 0) {
            System.out.println("Incorrect data");
            return;
        }
        System.out.println(" In Big Jar: " + distributeApples(apples, capacityBigJar));
        System.out.println(" In Medium Jar: " + distributeApples(restApplesAfterBigJar, capacityMediumJar));
        System.out.println(" In Small Jar: " + distributeApples(restApplesAfterBMediumJar, capacitySmallJar));

    }

    public static int distributeApples(int apples, int capacityOfTheJar) {
        return apples / capacityOfTheJar;
    }

    public static int restOfApples(int apples, int capacityOfTheJar) {
        int restApples = apples % capacityOfTheJar;
        return restApples;
    }

}


