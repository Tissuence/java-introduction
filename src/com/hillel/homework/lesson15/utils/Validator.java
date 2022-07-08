package com.hillel.homework.lesson15.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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



}