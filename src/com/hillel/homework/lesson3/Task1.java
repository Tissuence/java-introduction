package com.hillel.homework.lesson3;

public class Task1 {
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
        double PI = Math.PI;

        float V1 = (float) (y * PI * (Math.pow(r1, 3)));
        System.out.println("V1 = " + Math.round(V1) +" m" + x);

        float m1 = p * V1;
        System.out.println("M1 = " + Math.round(m1) + " kg");
        System.out.println();

//Второй шар:

        float V2 = (float) (y * PI * (Math.pow(r2, 3)));
        System.out.println("V2 = " + Math.round(V2) +" m" + x);

        float m2 = p * V2;
        System.out.print("m2 = "); System.out.printf("%.3f",m2);
        System.out.print(" kg");
        System.out.println();
        System.out.println();

//Третий шар: System.out.printf("%.3f",value)

        float V3 = (float) (y * PI * (Math.pow(r3, 3)));
        System.out.print("V3 = "); System.out.printf("%.3f",V3);
        System.out.print(" m" + x);
        System.out.println();

        float m3 = p * V3;
        System.out.print("m3 = "); System.out.printf("%.3f",m3);
        System.out.print(" kg");
        System.out.println();


        double m = m1 + m2 + m3;
        System.out.println("Answer: The snowman's weight is " + Math.round(m) + " kg" );










    }
}
