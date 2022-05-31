package com.hillel.classwork.lesson10;

public class Binary {

    public static void main(String[] args) {

        int i = 45;
        System.out.println( i + " " + Integer.toBinaryString(i));

        int result = ~i;
        System.out.println( result + " " + Integer.toBinaryString(result));

        int a = 56;
        System.out.println( a + " " + Integer.toBinaryString(a));

        int and = i & a;
        System.out.println( and + " " + Integer.toBinaryString(and));

        int or = i | a;
        System.out.println(or + " " + Integer.toBinaryString(or));
    }

}
