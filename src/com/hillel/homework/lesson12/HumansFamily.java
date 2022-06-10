package com.hillel.homework.lesson12;


public class HumansFamily {

    public static void main(String[] args) {

        Human grandfather1 = new Human("Grandfather", "Panas", 82);
        Human grandfather2 = new Human("Grandfather", "Vasyl", 85);
        Human grandmother1 = new Human("Grandmother", "Evdokia", 82);
        Human grandmother2 = new Human("Grandmother", "Sofia", 79);
        Human mom = new Human("Mom", "Maria", 34, grandmother1, grandfather1);
        Human dad = new Human("Dad", "Ivan", 38, grandmother2, grandfather2);
        Human child = new Human("Daughter", "Oksana", 12, mom, dad);

        Object[] family = new Object[]{child, mom, dad, grandfather1, grandmother1, grandfather2, grandmother2};
        printArray(family);
    }

    private static void printArray(Object[] family) {
        for (Object human : family) {
            System.out.print(human);
        }
    }
}

