package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrAnd {

    public static void main(String[] args) throws IOException {

        /*
        є відстань між містами
        якщо відстань від 0 до 100 км то зеленим підсвітити
        якщо від 100 до 300 оранжевим
        якщо від 300 то червоним
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int distance = Integer.parseInt(reader.readLine());

        if (distance < 100) {
            System.out.println("green");
        } else if (distance < 300) {
            System.out.println("orange");
        } else {
            System.out.println("red");
        }



    }
}