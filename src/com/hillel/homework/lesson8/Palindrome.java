package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String inputText = READER.readLine();
        READER.close();
        String inputTextWithoutTab = inputText.replaceAll(" ", "");
        String inputTextWithoutTabSymbols = inputTextWithoutTab.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "");
        System.out.println(inputTextWithoutTabSymbols);
        char[] charArray = inputTextWithoutTabSymbols.toCharArray();
        System.out.println(Arrays.toString(charArray));


        if (isItPalindrome(charArray)) {
            System.out.println("It's a palindrome");
            return;
        }
        System.out.println("It's not a palindrome");
    }

    public static boolean isItPalindrome(char[] symbols) {
        for (int i = 0, j = symbols.length - 1; i < symbols.length && j > 0 ; i++, j--) {
            if (symbols[i] == (symbols[j])) {
            } else {
                return false;
            }
        }
        return true;
    }

}
