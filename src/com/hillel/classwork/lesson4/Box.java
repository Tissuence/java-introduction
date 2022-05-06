package com.hillel.classwork.lesson4;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input lenght, width, depth: ");
        int lenght = scanner.nextInt();
        int width = scanner.nextInt();
        int depth = scanner.nextInt();
        int volume = calculateVolume(lenght, width, depth);
        System.out.println("Volume = " + volume);

        System.out.println("Volume = " + calculateVolume(5, 5, 5));

    }

    public static int calculateVolume(int lenght, int width, int depth) {
        return lenght * width * depth;
    }
}
