package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work {

    public static void main(String[] args) throws IOException {

        // що таке конкатенація
        String text = "text";
        String text2 = text + " new";
        System.out.println(text2 + true);
        System.out.println(text2 + 4);
        System.out.println("test" + " 2");

        int number = 10;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean booleanValue = Boolean.parseBoolean(reader.readLine());
        // == !=

        if (!booleanValue) {
            System.out.println("you are true");
        } else {
            System.out.println("you are false");
        }


    }
}