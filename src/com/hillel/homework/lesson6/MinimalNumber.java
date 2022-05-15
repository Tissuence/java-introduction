package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimalNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(" Minimal number is: " + whichMinimal(a,b,c));

    }

    public static int whichMinimal(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}