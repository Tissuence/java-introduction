package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Діти зібрали урожай яблук. Бабуся робить консервацію, спершу розкладає у великі банки по 5 яблука,
якщо є залишок - то у середні по 3 яблука, якщо і після цього є залишок, то у маленькі банки по одному яблуку.
Порахуйте скільки і яких заготовок отримає сім'я, у залежності від кількості зібраних яблук.

Ваша програма отримує від користувача кількість яблук.

Наприклад, діти принесли 59 ябук.

Вивід в консоль:

Великих банок - 11;
Середніх банок - 1;
Маленьких банок -1;*/

public class ApplesInJar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quantity of apples:");
        int apples = Integer.parseInt(reader.readLine());
        int rest1 = apples % 5;
        int rest2 = rest1 % 3;

        if (apples < 0) {
            System.out.println("Incorrect data");
            return;
        }
        distributeApples(apples, 5, "Big jars: ");
        distributeApples(rest1, 3, "Medium jars: ");
        distributeApples(rest2, 1, "Small jars: ");

    }


    public static int distributeApples(int apples, int divider, String message) {
        int rest = apples % divider;
        if (apples % divider != 0) {
            int result = rest / divider;
        }
        int result = apples / divider;
        System.out.println(message + result);
        return result;
    }


}


