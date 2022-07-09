package com.hillel.homework.lesson15.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Validator {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static String validateInputText() throws IOException {
        String str = READER.readLine();
        while (str.trim().isEmpty()) {
            System.out.println("Ви не ввели жодного значення! ");
            str = READER.readLine();
        }
        return str;
    }

    public static int validateIndex(int size) throws IOException {
        int index;
        try {
            index = Integer.parseInt(READER.readLine());
            if (index <= 0 || index > size) {
                System.out.println("Такого номеру не iснує, введiть номер ще раз.");
                return validateIndex(size);
            }
        } catch (NumberFormatException | IndexOutOfBoundsException exception) {
            System.out.println("Ви ввели невiрне значення! Спробуйте ще раз.");
            return validateIndex(size);
        }
        return --index;
    }

    public static int validateYear() {
        LocalDate localDate = LocalDate.now();
        try {
            int year = Integer.parseInt(READER.readLine());
            if (year <= 0 || year > localDate.getYear()) {
                System.out.println("Точно в цьому році?");
                return validateYear();
            } else {
                return year;
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Введи рік ще раз, але уважно!");
            return validateYear();
        }
    }
}
