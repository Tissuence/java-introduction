package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FromBigToSmallArray {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] bigArray = createArray(20);
        System.out.println(" Input array values: ");
        fillArray(bigArray);
        System.out.println("Big Array: ");
        printArray(bigArray);

        int[] firstSmallArray = createArray(10);
        int[] secondSmallArray = createArray(10);

        extractTheFirstSmallArray(bigArray, firstSmallArray);

        System.out.println();
        System.out.println(" First half of the Big Array: ");
        printArray(firstSmallArray);

        extractTheSecondSmallArray(bigArray, secondSmallArray);

        System.out.println();
        System.out.println(" Second half of the Big Array: ");
        printArray(secondSmallArray);

// проверяла как работает класс Array
        System.out.println();
        int[] numbersCopy2 = Arrays.copyOfRange(bigArray, 0,10);
        System.out.println(Arrays.toString(numbersCopy2));

        int[] numbersCopy = Arrays.copyOfRange(bigArray, 10,20);
        System.out.println(Arrays.toString(numbersCopy));

    }

    private static void extractTheSecondSmallArray(int[] bigArray, int[] secondSmallArray) {
        for (int i = bigArray.length / 2; i <= bigArray.length - 1; i++) {
            secondSmallArray[i - bigArray.length / 2] = bigArray[i];
        }
    }

    public static void extractTheFirstSmallArray(int[] bigArray, int[] firstSmallArray) {
        for (int i = 0; i < bigArray.length / 2; i++) {
            firstSmallArray[i] = bigArray[i];
        }
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public static void fillArray(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(READER.readLine());
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
