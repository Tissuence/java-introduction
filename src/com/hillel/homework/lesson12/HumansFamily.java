package com.hillel.homework.lesson12;

import java.util.ArrayList;

public class HumansFamily {

    public static void main(String[] args) {

        ArrayList family = new ArrayList(3);
        family.add(new Human("Mom", "Maria", 34));
        family.add(new Human("Dad", "Ivan", 38));
        family.add(new Human("Daughter", "Oksana", 12));

        printArrayList(family);
    }

    private static void printArrayList(ArrayList family) {
        for (Object human : family) {
            System.out.print(human);
        }
    }
}
