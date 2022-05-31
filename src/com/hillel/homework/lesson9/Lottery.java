package com.hillel.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {

    public static void main(String[] args) throws IOException {

        int[] numbersByCompany = new int[7];
        fillNumbersByCompany(numbersByCompany);
        Arrays.sort(numbersByCompany);

        int[] numbersByUser = new int[7];
        fillNumbersByUser(numbersByUser);
        Arrays.sort(numbersByUser);

        System.out.println(Arrays.toString(numbersByCompany));
        System.out.println(Arrays.toString(numbersByUser));

        int matches = compareAndFindMatches(numbersByCompany, numbersByUser);
        System.out.println("Number of matches: " + matches);
    }

    private static void fillNumbersByUser(int[] numbersByUser) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter number between 0 and 9 inclusive:");
        for (int i = 0; i < numbersByUser.length; i++) {
            numbersByUser[i] = Integer.parseInt(reader.readLine());
            if (numbersByUser[i] < 0 || numbersByUser[i] > 9) {
                System.out.println("Try another number between 0 and 9");
            }
        }
    }

    private static void fillNumbersByCompany(int[] numbersByCompany) {
        for (int i = 0; i < numbersByCompany.length; i++) {
            numbersByCompany[i] = (int) (Math.random() * 10);
        }
    }

    public static int compareAndFindMatches(int[] first, int[] second) {
        int counter = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                counter++;
            }
        }
        return counter;
    }
}

