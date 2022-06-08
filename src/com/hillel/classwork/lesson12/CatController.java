package com.hillel.classwork.lesson12;

public class CatController {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Bill", 3, 7, 10);
        Cat cat2 = new Cat("Tom", 2, 13, 8);
        Cat cat3 = new Cat("Jack", 6, 4, 14);
        Cat cat4 = new Cat("Sam", 5, 15, 3);

        String winner = cat1.catFight(cat2);
        startOfTheBattle(cat1, cat2, winner);
        }

    private static void startOfTheBattle(Cat cat1, Cat cat2, String winner) {
        if (winner != null) {
            System.out.println("В боротьбі кота " + cat1.getName() + " та " + cat2.getName() + " переміг " + winner);
        } else {
            System.out.println(" Обидва котики настільки сильні, що неможливо визначити переможця :)");
        }
    }
}
