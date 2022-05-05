package com.hillel.homework.lesson4;

public class Airplanes {
    public static void main(String[] args) {


        printAirplaneInfo("Jet", "Alpha");
        printAirplaneInfo("Airliner", "Boeing 737", 160);
        printAirplaneInfo("Airline", "Airbus A320", 145, 30);


    }

    public static void printAirplaneInfo(String name, String type){
        System.out.println("Тип літака: " + name + ", модель: " + type);}

    public static void printAirplaneInfo(String name, String type, int econom){
        System.out.println("Тип літака: " + name + ", модель: " + type + ", Кількість пасажирів економ класу:  " + econom);}

    public static void printAirplaneInfo(String name, String type, int econom, int business){
        System.out.println("Тип літака: " + name + ", модель: " + type + ", Кількість пасажирів економ класу:  " + econom + ", Кількість пасажирів бізнес класу:  " + business);}



    }









