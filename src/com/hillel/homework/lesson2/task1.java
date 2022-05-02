package com.hillel.homework.lesson2;

public class task1 {

    public static void main(String[] args) {

        int a = 60;
        System.out.println("a = " + a);

        int b = 28;
        System.out.println("b = " + b);

        int c = a + b;
        a = c - a;
        b = c - b;

        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


