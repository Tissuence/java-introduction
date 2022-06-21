package com.hillel.homework.lesson13.coffeemachine;

public class Drink {

    private String name;
    private int price;

    public Drink() {
    }

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

    protected void drinkPreparing() throws InterruptedException {
        System.out.println("Your drink is preparing...");
        Thread.sleep(1000);
    }
}