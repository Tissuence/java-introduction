package com.hillel.homework.lesson11;

public class GeneratePassword {
    public static final String LOW_CASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER_CASE = LOW_CASE.toUpperCase();
    public static final String NUMBERS = "0123456789";
    public static final char UNDERSCORE = '_';
    public static final String ALL_SYMBOLS = LOW_CASE + UPPER_CASE + NUMBERS + UNDERSCORE;
    private static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        String password = shufflePassword(generatePassword());
        System.out.println(password);
    }

    public static String generatePassword() {

        return shufflePassword(new StringBuilder(PASSWORD_LENGTH)
                .append(generateRandomSymbols(LOW_CASE, 1))
                .append(generateRandomSymbols(UPPER_CASE, 1))
                .append(generateRandomSymbols(NUMBERS, 1))
                .append(generateRandomSymbols(ALL_SYMBOLS, 4))
                .append(UNDERSCORE)
                .toString());
    }

    private static String generateRandomSymbols(String symbols, int size) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = (int) (Math.random() * symbols.length());
            result.append(symbols.charAt(index));
        }
        return result.toString();
    }

    private static String shufflePassword(String password) {
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