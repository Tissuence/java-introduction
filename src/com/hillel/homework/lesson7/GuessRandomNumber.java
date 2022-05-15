package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessRandomNumber {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int max = 10;
        int min = 1;
        double random = Math.random();
        int i = (int) (random * (max - min) - min);
        System.out.println("Let's try, write the number:");
        int input = Integer.parseInt(READER.readLine());

        while (i != input) {
            System.out.println("Not yet, try again!");
            input = Integer.parseInt(READER.readLine());
        }
        System.out.println("You win! It's number " + i);

    }

}


