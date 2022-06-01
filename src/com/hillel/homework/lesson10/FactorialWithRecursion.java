package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialWithRecursion {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println(" Enter number: ");
        int numberByUser = Integer.parseInt(reader.readLine());
        int numberFactorial = factorial(numberByUser);
        System.out.println(numberFactorial);
    }

    public static int factorial(int number){
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }
}
