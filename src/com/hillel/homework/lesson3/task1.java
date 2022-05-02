package com.hillel.homework.lesson3;

public class task1 {
    public static void main(String[] args) {
     //Дано
        float r1 = 1;
        System.out.println("R Ball #1 = " + r1 + " m");

        float r2 = 0.5f;
        System.out.println("R Ball #2 = " + r2 + " m");

        float r3 = 0.2f;
        System.out.println("R Ball #3 = " + r3 + " m");
        System.out.println();

        float p = 0.7f;
        char x = '\u00b3';
        System.out.println("p = " + p + " kg/m" + x );
        System.out.println();

        //Решение

//Первый шар:
        double y = (4.0 / 3.0);
        double a = (Math.PI*r1);

        float V1 = (float) (y * (Math.pow(a, 3)));
        System.out.println("V1 = " + Math.round(V1) +" m" + x);

        float m1 = p * V1;
        System.out.println("M1 = " + Math.round(m1) + " kg");
        System.out.println();

//Второй шар:
        double b = (Math.PI*r2);

        float V2 = (float) (y * (Math.pow(b, 3)));
        System.out.println("V2 = " + Math.round(V2) +" m" + x);

        float m2 = p * V2;
        System.out.println("M2 = " + Math.round(m2) + " kg");
        System.out.println();

//Третий шар:
        double c = (Math.PI*r3);

        float V3 = (float) (y * (Math.pow(c, 3)));
        System.out.println("V3 = " + V3 +" m" + x);

        float m3 = p * V3;
        System.out.println("M3 = " + m3 + " kg");

        /* данные третьего шара не округляла, так округляет до целого,
        а по методу из интернета округлить до нескольких знаков после запятой не получилось( */

        double m = m1 + m2 + m3;
        System.out.println("The snowman's weight is " + Math.round(m) + " kg" );










    }
}
