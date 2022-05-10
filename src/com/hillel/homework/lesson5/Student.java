package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    public static void main(String[] args) throws IOException {

        /*Выяснить получит ли студент повышенную стипендию, просто стипендию или не получит стипендию вообще
        в зависимости от его оценок.
Пользователь вводит через консоль свои оценки по 5 предметам(любым).
Для повышеной стипендии средний балл должен быть не меньше 10
Для обычной стипендии - не меньше 8
Программа должна вывести на экран средний бал и на какую стипендию может рассчитывать студент.*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter an assessment 'Math': ");
        int math = Integer.parseInt(reader.readLine());

        if (isAssessmentValid(math)) {
            System.out.println();
        } else {
            System.out.println("Incorrect data!");
            return;
        }

        System.out.println("enter an assessment 'Geography': ");
        int geography = Integer.parseInt(reader.readLine());

        System.out.println("enter an assessment 'Native Language': ");
        int language = Integer.parseInt(reader.readLine());

        System.out.println("enter an assessment 'History': ");
        int history = Integer.parseInt(reader.readLine());

        System.out.println("enter an assessment 'Chemistry': ");
        int chemistry = Integer.parseInt(reader.readLine());

        double average = averageAssessment(math, geography, language, history, chemistry);
        System.out.println("Your Average Assessment is: " + average);

        if (average >= 10 && average <= 12) {
            System.out.println("You have got increased grants");
        } else if (average >= 8 && average < 10) {
            System.out.println("You have got simple grants");
        } else if (average >= 0 && average < 8) {
            System.out.println("You don't have got any grants");
        } else
            System.out.println("Incorrect data!");

    }


    public static double averageAssessment(int math, int geography, int language, int history, int chemistry) {
        double average = (double) (math + geography + language + history + chemistry) / 5;
        return average;
    }

    public static boolean isAssessmentValid(int assessment) {
        if (assessment >= 0 && assessment <= 12) ;
        return true;
    } //else

    {
       // return false;

    }

}
