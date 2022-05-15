
package com.hillel.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        /**
         * Считывать с консоли числа, пока пользователь не напишет слово сумма
         * После ввода слова сумма, нужно вывести в консоль сумму всех введенных чисел
         */
        String input = READER.readLine();
        while (!input.equalsIgnoreCase("stop")) {
            System.out.println("your input: " + input);
            input = READER.readLine();
        }

    }

}
