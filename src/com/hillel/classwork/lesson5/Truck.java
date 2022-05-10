package com.hillel.classwork.lesson5;

public class Truck {
    public static void main(String[] args) {

        int lenght = 10;
        int width = 40;
        int height = 78;

        int volume = calculateVolume(lenght,width,height);
                System.out.println(volume);

        int maxWeight = 58;

        int totalWeight = calculateTotalWeight(volume, maxWeight);
        System.out.println(totalWeight);

    }

    public static int calculateVolume(int lenght, int width, int height) {
        return lenght * width * height;
    }

    public static int calculateTotalWeight(int volume, int maxWeight){
        return volume * maxWeight;
    }

}
