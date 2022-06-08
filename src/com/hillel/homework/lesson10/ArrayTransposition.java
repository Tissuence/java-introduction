package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTransposition {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Enter the quantity of columns:");
        int columns = readNumber();
        System.out.println("Enter the quantity of lines:");
        int lines = readNumber();

        int[][] originalArray = createAndFillArray(lines, columns);   
        printArray(originalArray, "Original array:");

        int[][] transposedArray = transposeArray(originalArray);
        printArray(transposedArray, " Transposed array:");
    }

    public static int readNumber() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (RuntimeException | IOException e) {
            System.out.println("incorrect input, try enter only numbers.");
            return readNumber();
        }
    }

    public static int[][] createAndFillArray(int lines, int columns) {
        int[][] array = new int[lines][columns];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers in " + (i + 1) + " line:");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = readNumber();
            }
        } return array;
    }

    public static void printArray(int[][] array, String message) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeArray(int[][] array) {
        int[][] transposedArray = new int[array[0].length][array.length];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        return transposedArray;
    }
}

