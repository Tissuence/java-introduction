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

        String message = " take your baggage to the cabin.";

        if (isBaggageHand(height, width, depth)) {
            message = "All's right, you can" + message;
        } else {
            message = "I'm sorry, you can't" + message;
        }
        System.out.println(message);
    }

    public static boolean isBaggageHand(int height, int width, int depth) {
        if (height <= 40 && width <= 55 && depth <= 20 || height <= 53 && width <= 40 && depth <= 22) {

            return true;
        } else {
            return false;

        }


    }
}