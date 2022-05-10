package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baggage {
    public static void main(String[] args) throws IOException {
        /* Выяснить может ли пассажир взять свою сумку в самолет по заданным габаритам.
Пользователь вводит в консоли габариты своей сумки или рюкзака, чемодана и программа выводит
 в консоль - пройдет ли данный багаж как ручная кладь.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Height:");
        int height = Integer.parseInt(reader.readLine());

        System.out.println("Enter Width:");
        int width = Integer.parseInt(reader.readLine());

        System.out.println("Enter Depth:");
        int depth = Integer.parseInt(reader.readLine());

        isBaggageHand(height, width, depth);

    }


    public static void isBaggageHand(int height, int width, int depth) {
        if (height <= 40 && width <= 55 && depth <= 20 || height <= 53 && width <= 40 && depth <= 22) {
            System.out.println("All's right, you can take your baggage to the cabin.");
            return;
        }
        System.out.println("I'm sorry, you can't take your baggage to the cabin.");

    }

}