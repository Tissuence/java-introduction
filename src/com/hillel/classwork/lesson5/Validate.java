package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validate {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (!isNumberValid(number)) {
            System.out.println("error. number is invalid: " + number);
            return;
        }

        System.out.println("you are win!");
    }

    public static boolean isNumberValid(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}