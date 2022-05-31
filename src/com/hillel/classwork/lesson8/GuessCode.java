package com.hillel.classwork.lesson8;

public class GuessCode {
    public static void main(String[] args) {


        int code = 9407;
        int units = code % 10;
        System.out.println(units);
        int dozens = (code / 10) % 10;
        System.out.println(dozens);
        int hundreds = (code / 100) % 10;
        System.out.println(hundreds);
        int thousands = (code / 1000) % 10;
        System.out.println(thousands);

        int[] numbers = {thousands, hundreds, dozens, units};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= 9; j++) {
                counter++;
                if ( numbers[i] == j) {
                    System.out.println("Your number: " + j);
                    break;
                }
            }

        }
        System.out.println(counter);
    }
}
