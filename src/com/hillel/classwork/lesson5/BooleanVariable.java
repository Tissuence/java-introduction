package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanVariable {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        String message = "your number is ";
        if (isEven(number)) {
            message += "even";
        } else {
            message += "odd";
        }

        // умова ? це значення : інше значення
        String msg = isEven(number) ? "your number is even" : "your number is odd";

        System.out.println(msg);

        int tax = calculateTax(1, 2);
        if (tax < 0) {
            System.out.println("error");
        } else {
            System.out.println("tax " + tax);
        }

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int calculateTax(int square, int rate) {

        if (square < 0 || rate < 0){
            return -1;
        } else {
            return square * rate;
        }

    }
}