package com.hillel.classwork.lesson4;

public class WarmUp {
    public static void main(String[] args) {

        float employee1 = 3000.0f;
        float employee2 = 4500.0f;
        float employee3 = 5800.0f;
        int years = 10;
        int monthsInYear = 12;

        float salaryEmployeer1 = employee1 * monthsInYear * years;
        System.out.println("Salary Employeer's #1 for 10 years = " + salaryEmployeer1 + " uah");

        float salaryEmployeer2 = employee2 * monthsInYear * years;
        System.out.println("Salary Employeer's #2 for 10 years = " + salaryEmployeer2 + " uah");

        float salaryEmployeer3 = employee3 * monthsInYear * years;
        System.out.println("Salary Employeer's #3 for 10 years = " + salaryEmployeer3 + " uah");
        System.out.println();

        float sumFor10year = salaryEmployeer1 + salaryEmployeer2 + salaryEmployeer3;
        float sumFor10yearWithoutTax = sumFor10year * 0.95f;
        System.out.println(" Sum of salary of all employees wihout tax  for 10 years: = " + sumFor10yearWithoutTax + " uah");
        System.out.println();

       float tax5percent = 0.05f;
        float tax1employeer = salaryEmployeer1 * tax5percent;
        float salaryWithoutTax1 = salaryEmployeer1 - tax1employeer;
        System.out.println("Employeer's #1 salary without tax for 10 years = " + salaryWithoutTax1 + " uah");

        float tax2employeer = salaryEmployeer2 * tax5percent;
        float salaryWithoutTax2 = salaryEmployeer2 - tax2employeer;
        System.out.println("Employeer's #2 salary without tax for 10 years = " + salaryWithoutTax2 + " uah");

        float tax3employeer = salaryEmployeer3 * tax5percent;
        float salaryWithoutTax3 = salaryEmployeer3 - tax3employeer;
        System.out.println("Employeer's #3 salary without tax for 10 years = " + salaryWithoutTax3 + " uah");
        System.out.println();

        float averageSalary = sumFor10yearWithoutTax / 120 / 3;
        System.out.println("Average Salary without Tax for 10 years = " + averageSalary + " uah");










    }
}
