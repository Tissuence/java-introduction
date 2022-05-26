package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {

    static final BufferedReader READER = new BufferedReader( new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] numbers = createAndFillArray(10);
        printArray(numbers);

    }

    public static int[] createAndFillArray(int size) throws IOException {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input number: " );
            int number = Integer.parseInt(READER.readLine());
            array[i] = number;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
