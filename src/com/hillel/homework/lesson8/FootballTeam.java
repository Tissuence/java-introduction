package com.hillel.homework.lesson8;

import java.util.Arrays;

public class FootballTeam {

    public static void main(String[] args) {

        int maxAge = 45;
        int minAge = 18;

        int[] firstFootballTeamAges = createAndFillFootballTeam(11, maxAge, minAge);
        int[] secondFootballTeamAges = createAndFillFootballTeam(11, maxAge, minAge);

        System.out.print("Ages of the First Team: ");
        printAllAges(firstFootballTeamAges);
        System.out.println();
        System.out.print("Ages of the Second Team: ");
        printAllAges(secondFootballTeamAges);

        System.out.println();

        if (AverageAge(firstFootballTeamAges) > AverageAge(secondFootballTeamAges)) {
            System.out.println(" The average age of the First team is higher");
        }
            System.out.println(" The average age of the Second team is higher");

    }

    public static int[] createAndFillFootballTeam(int size, int maxAge, int minAge) {

        int[] footballTeamAges = new int[size];
        for (int i = 0; i < footballTeamAges.length; i++) {
            int age = (int) (Math.random() * (maxAge - minAge) + minAge);
            footballTeamAges[i] = age;
        }
        return footballTeamAges;

    }

    public static void printAllAges(int[] footballTeamAges) {
        for (int i = 0; i < footballTeamAges.length; i++) {
            System.out.print(footballTeamAges[i] + ", ");
        }
    }

    public static int AverageAge(int[] footballTeamAges) {
        int sum = 0;

        for (int age : footballTeamAges) {
            sum += age;

        }
        int result = sum / footballTeamAges.length;
        return result;
    }
}
