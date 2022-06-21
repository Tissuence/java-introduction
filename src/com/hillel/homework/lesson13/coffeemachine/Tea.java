package com.hillel.homework.lesson13.coffeemachine;

public class Tea extends Drink {

    public Tea(String name, int price) {
        super(name, price);
    }

    public void drinkPreparing() throws InterruptedException {
        super.drinkPreparing();
        System.out.println("Here your Tea!");
    }
}
