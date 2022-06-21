package com.hillel.homework.lesson13.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Drink {

    public Drink() {
    }

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

    protected void drinkPreparing() throws InterruptedException {
        System.out.println("Your drink is preparing...");
        Thread.sleep(1000);
    }

}
