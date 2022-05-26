package com.hillel.classwork.lesson8;

import java.io.IOException;

public class WhoKilledKennedy {
    public static void main(String[] args) throws IOException {

        int[] values = createAndFillArray(10);
        int index = 0;
        int max = values[index];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                index = i;
            }

        }

        System.out.println(index + " murder " + max);

    }

    public static int[] createAndFillArray(int size) throws IOException {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 100);
            array[i] = number;
            System.out.println(number);
        }
        return array;

    }
}
