package com.hillel.homework.lesson11;

public class GeneratePassword {
    public static final String LOW_CASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER_CASE = LOW_CASE.toUpperCase();
    public static final String NUMBERS = "0123456789";
    public static final char UNDERSCORE = '_';
    public static final String ALL_SYMBOLS = LOW_CASE + UPPER_CASE + NUMBERS + UNDERSCORE;
    public static final int SIZE = ALL_SYMBOLS.length();
    private static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        StringBuilder password = generatePassword();
        String readyPassword = password.toString();
        System.out.println(shufflePassword(readyPassword));
    }

    public static StringBuilder generateRandomSymbols(String symbols, int size) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = (int) (Math.random() * symbols.length());
            result.append(symbols.charAt(index));
        }
        return result;
    }

    public static StringBuilder generatePassword() {

        StringBuilder result = new StringBuilder(PASSWORD_LENGTH);
        StringBuilder lowerCase = generateRandomSymbols(LOW_CASE, 1);
        StringBuilder upperCase = generateRandomSymbols(UPPER_CASE, 1);
        StringBuilder numbers = generateRandomSymbols(NUMBERS, 1);
        StringBuilder otherSymbols = generateRandomSymbols(ALL_SYMBOLS, 4);
        StringBuilder password = result.append(lowerCase).append(upperCase).append(numbers).append(UNDERSCORE).append(otherSymbols);
        return password;
    }

    public static String shufflePassword(String password) {
        char[] characters = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            int randomIndex = (int) (Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
}