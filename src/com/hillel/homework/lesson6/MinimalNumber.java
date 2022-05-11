package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimalNumber {
    public static void main(String[] args) throws IOException {

        /* Задано 3 случайных числа. Вывести минимальное. */

        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        whichMinimal(a,b,c);

    }

    public static void whichMinimal(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println("Minimal number is " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Minimal number is " + b);
        } else {
            System.out.println("Minimal number is " + c);
        }


    }
}