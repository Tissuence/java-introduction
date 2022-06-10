package com.hillel.homework.lesson12;
public class HumansFamily {
    public static void main(String[] args) {

        Human grandfather2 = new Human("Grandfather", "Vasyl", 85);
        Human grandmother1 = new Human("Grandmother", "Evdokia", 82);
        Human mom = new Human("Mom", "Maria", 34, grandmother1, null);
        Human dad = new Human("Dad", "Ivan", 38, null, grandfather2);
        Human child = new Human("Daughter", "Oksana",12, mom, dad);

        Human[] family = new Human[]{child, mom, dad, grandmother1, grandfather2};
        printArray(family);
    }

    private static void printArray(Human[] family) {
        for (Human human : family) {
            System.out.print(human);
        }
    }
}

