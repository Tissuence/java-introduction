package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTransposition {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        int[][] originalArray = createArray();
        fillArray(originalArray);
        printArray(originalArray);
    }
    public static int[][] createArray() {

        try {
            System.out.println("Enter the quantity of columns:");
            int columns = Integer.parseInt(READER.readLine());
            System.out.println("Enter the quantity of lines:");
            int lines = Integer.parseInt(READER.readLine());
            int[][] array = new int[columns][lines];
            return array;
        } catch (IOException e) {
            System.out.println("incorrect input, try enter only numbers.");
            return createArray();
        }
    }
    /*public static void fillArray(int[][] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter numbers in line:");
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Integer.parseInt(READER.readLine());
                }
            }
        } catch (RuntimeException | IOException exception) {
            System.out.println("incorrect input");
            fillArray(array);
        }
    }*/
    public static void fillArray(int[][] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter numbers in line:");
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Integer.parseInt(READER.readLine());
                }
            }
        } catch (RuntimeException | IOException exception) {
            System.out.println("Invalid input. Try again");
            fillArray(array);
        }
    }

        public static void printArray ( int[][] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        }
    }

