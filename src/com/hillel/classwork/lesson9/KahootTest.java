package com.hillel.classwork.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KahootTest {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // Integer
        int intNumber = Integer.parseInt(READER.readLine());
        System.out.println(intNumber);

//        double doubleNumber = Double.parseDouble(READER.readLine());
//        System.out.println(doubleNumber);

        int[] arr = createArrayAndFill(intNumber);
        System.out.println(Arrays.toString(arr));

        /*int[] arr2 = createArrayAndFill(2);
        System.out.println(Arrays.toString(arr2));*/

    }

    public static int[] createArrayAndFill(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = readNumber(1, 10);
        }
        return array;
    }

    public static int readNumber() {
        System.out.println("input number:");
        try {
            return Integer.parseInt(READER.readLine());
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber();
        }
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number:");
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("input must be in range from " + min + " to " + max);
                return readNumber(min, max);
            }
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber(min, max);
        }
    }
}