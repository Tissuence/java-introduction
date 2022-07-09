package com.hillel.homework.lesson15.utils;

import com.hillel.homework.lesson15.model.Author;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static com.hillel.homework.lesson15.controller.AuthorController.AUTHORS;
import static com.hillel.homework.lesson15.controller.AuthorController.READER;

public class Validator {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static String validateInputText() throws IOException {
        String str = READER.readLine();
        while (str.isEmpty()) {
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
                System.out.println("Такого номеру не iснуэ, введiть номер ще раз.");
                return validateIndex(size);
            }
        } catch (NumberFormatException | IndexOutOfBoundsException exception) {
            System.out.println("Ви ввели невiрне значення! Спробуйте ще раз.");
            return validateIndex(size);
        }
        return --index;
    }

}
