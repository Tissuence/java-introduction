package com.hillel.homework.lesson10;

public class SortingNegatives {

    public static void main(String[] args) {

   int[][] array = new int[10][10];
   fillArray(array);
   printArray(array);
   sortNegativeNumber(array);

    }
    public static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (int) (Math.random() * 10 - 5);
            }
        }
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void sortNegativeNumber(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.print("("+ i + ";" + j + ")");
                }
                System.out.print("  ");
            } System.out.println();
        }
    }
}
