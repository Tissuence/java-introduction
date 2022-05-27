package com.hillel.homework.lesson8;

public class FootballTeam {

    public static void main(String[] args) {

        int maxAge = 45;
        int minAge = 18;
        int numberOfPlayers = 11;

        int[] firstFootballTeamAges = createAndFillFootballTeam(numberOfPlayers, maxAge, minAge);
        int[] secondFootballTeamAges = createAndFillFootballTeam(numberOfPlayers, maxAge, minAge);

        System.out.println("Ages of the First Team: ");
        printAllAges(firstFootballTeamAges);
        System.out.println();
        System.out.println("Ages of the Second Team: ");
        printAllAges(secondFootballTeamAges);

        System.out.println();

        compareAverageAge(firstFootballTeamAges, secondFootballTeamAges);
    }

    private static void compareAverageAge(int[] firstFootballTeamAges, int[] secondFootballTeamAges) {
        if (averageAge(firstFootballTeamAges) > averageAge(secondFootballTeamAges)) {
            System.out.println(" The average age of the First team is higher");
        } else if (averageAge(firstFootballTeamAges) == averageAge(secondFootballTeamAges)){
            System.out.println(" The average age of the both team is equal");
        } else {
            System.out.println(" The average age of the Second team is higher");
        }
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

    public static double averageAge(int[] footballTeamAges) {
        int sum = 0;

        for (int age : footballTeamAges) {
            sum += age;
        }
        return (double) sum / footballTeamAges.length;
    }
}
 