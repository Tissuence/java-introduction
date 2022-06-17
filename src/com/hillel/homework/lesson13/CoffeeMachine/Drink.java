package com.hillel.homework.lesson13.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Drink {

    public Drink() {
    }

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private int price;


    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", price: " + price;
    }

    public int getPrice() {
        return price;
    }

    public void makeOrderListOFDrinks() throws InterruptedException, IOException {
        ArrayList<Drink> order = new ArrayList<>();
        do {
            System.out.println("Choose number of drink: " + "\n" + "Americano - 1" +
                    "\n" + "Latte - 2" + "\n" + "Cappuccino - 3" + "\n" + "Tea - 4");
            int number = readNumberFromConsole();
            chooseDrink(order, number);
            System.out.println("для виходу з програми натисніть exit, щоб продовжити - будь-яку кнопку");
        } while (!(READER.readLine().equals("exit")));
        printOrderWithTotalCost(order);
        startCoffeeMachine(order);
    }

    private void chooseDrink(ArrayList<Drink> order, int number) {
        switch (number) {
            case 1 -> order.add(new Americano("Americano", 25));
            case 2 -> order.add(new Latte("Latte", 40));
            case 3 -> order.add(new Cappuccino("Cappuccino", 45));
            case 4 -> order.add(new Tea("Tea", 20));
        }
    }

    private int readNumberFromConsole() {
        int number = 0;
        try {
            number = Integer.parseInt(READER.readLine());
        } catch (RuntimeException | IOException e) {
            System.out.println("Incorrect input");
            readNumberFromConsole();
        }
        if (number > 4 || number < 0) {
            System.out.println("From 0 to 4!");
        }
        return number;
    }

    public void printOrderWithTotalCost(ArrayList<Drink> order) {
        int theCostTheWholeOrder = 0;
        for (Drink drink : order) {
            theCostTheWholeOrder += drink.getPrice();
            System.out.println(drink);
        }
        System.out.println("The cost of your order is: " + theCostTheWholeOrder + " grn");
    }

    private void startCoffeeMachine(ArrayList<Drink> order) throws InterruptedException {
        for (Drink drink : order) {
            drink.drinkPreparing();
        }
    }

    protected void drinkPreparing() throws InterruptedException {
        System.out.println("Your drink is preparing...");
        Thread.sleep(1000);
    }
}
