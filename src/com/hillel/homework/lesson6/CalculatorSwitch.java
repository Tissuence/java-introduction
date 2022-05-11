package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorSwitch {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number 1: ");
        double number1 = Double.parseDouble(in.readLine());

        System.out.println("Enter Math operation: ");
        char operation = in.readLine().charAt(0);

        System.out.println("Enter Number 2: ");
        double number2 = Double.parseDouble(in.readLine());

        if (number2 == 0 && operation == '/') {
            System.out.println("Divide by zero error encountered");
            return;
        }

        double result = calculateResult(number1, operation, number2);
        System.out.println("Result: " + result);




    }

    public static double calculateResult(double number1, char operation, double number2) {
        double result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;

            default:
                System.out.println("Unknown operation");

        }
        return result;
    }

}