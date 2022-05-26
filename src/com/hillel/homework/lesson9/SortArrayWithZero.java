package com.hillel.homework.lesson9;

import java.util.Arrays;

public class SortArrayWithZero {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        fill(numbers);
        removeZeroToTheBeginning(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);

            if (numbers[i] < 40) {
                numbers[i] = 0;
            }
        }
    }

    public static void removeZeroToTheBeginning(int[] numbers) {
        for (int i = numbers.length - 1; i >= 1; i--) {

            for (int j = numbers.length - 1; j >= 0; j--) {

                if (numbers[j] == 0) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}

