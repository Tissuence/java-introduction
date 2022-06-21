package com.hillel.homework.lesson13.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachine {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
   static int AMERICANO_PRICE = 25;
    static int LATTE_PRICE = 40;
   static int CAPPUCCINO_PRICE = 45;
   static int TEA_PRICE = 20;
    public static void main(String[] args) throws InterruptedException, IOException {
        ArrayList<Drink> order = new ArrayList<>();
        makeOrderListOFDrinks(order);
        printOrderWithTotalCost(order);
        startCoffeeMachine(order);
    }

    public static void makeOrderListOFDrinks(ArrayList<Drink> order) throws IOException {

        do {
            System.out.println("Choose number of drink: " + "\n" + "Americano - 1" +
                    "\n" + "Latte - 2" + "\n" + "Cappuccino - 3" + "\n" + "Tea - 4");
            int number = readNumberFromConsole();
            Drink drink = createDrink(number);
            if (drink != null) {
                order.add(drink);
            }
            System.out.println("для виходу з програми натисніть exit, щоб продовжити - будь-яку кнопку");
        } while (!(READER.readLine().equals("exit")));
    }

    public static Drink createDrink(int number) {
        Drink drink = null;
        switch (number) {
            case 1 -> drink = new Americano("Americano", AMERICANO_PRICE);
            case 2 -> drink = new Latte("Latte", LATTE_PRICE);
            case 3 -> drink = new Cappuccino("Cappuccino", CAPPUCCINO_PRICE);
            case 4 -> drink = new Tea("Tea", TEA_PRICE);
        } return drink;
    }

    private static int readNumberFromConsole() {
        int number = 0;
        try {
            number = Integer.parseInt(READER.readLine());
        } catch (RuntimeException | IOException e) {
            System.out.println("Incorrect input");
            readNumberFromConsole();
        }
        if (number > 4 || number < 0) {
            System.out.println("From 0 to 4!");
            readNumberFromConsole();
        }
        return number;
    }

    public static void printOrderWithTotalCost(ArrayList<Drink> order) {
        int theCostTheWholeOrder = 0;
        for (Drink drink : order) {
            theCostTheWholeOrder += drink.getPrice();
            System.out.println(drink);
        }
        System.out.println("The cost of your order is: " + theCostTheWholeOrder + " grn");
    }

    private static void startCoffeeMachine(ArrayList<Drink> order) throws InterruptedException {
        for (Drink drink : order) {
            drink.drinkPreparing();
        }
    }
}
