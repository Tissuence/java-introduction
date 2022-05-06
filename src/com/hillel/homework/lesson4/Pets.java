package com.hillel.homework.lesson4;

public class Pets {
    public static void main(String[] args) {

        //У вас есть 24 собаки и 8 котов. Порция обеда для каждого животного составляет 50 грамм и стоит 2 доллара. Животные кушают 3 раза в день.
//Программа должна посчитать:
//Сколько нужно корма для котов в месяц?
//Сколько нужно корма для собак в месяц?
//Сколько нужно денег в месяц на содержание приюта?

        int dogs = 24;
        int cats = 8;
        int meal = 50;
        int cost = 2;
        int mealFrequency = 3;
        int dayInMonth = 30;


        int dogsMealPer1Months = calculateMeal(dogs, meal, mealFrequency, dayInMonth);
        System.out.println("Dogs need " + dogsMealPer1Months / 1000 + " kg of feed per one month.");

        int catsMealPer1Months = calculateMeal(cats, meal, mealFrequency, dayInMonth);
        System.out.println("Cats need " + catsMealPer1Months / 1000 + " kg of feed per one month.");


        int costAllMealPer1Month = calculateCostPrice(dogsMealPer1Months, catsMealPer1Months, cost, meal);
        System.out.println("The shelter needs " + costAllMealPer1Month + " dollars per 1 month.");


    }

    public static int calculateMeal(int animal, int meal, int mealFrequency, int dayInMonth) {
        return animal * meal * mealFrequency * dayInMonth;
    }

    public static int calculateCostPrice(int dogsMeal, int catsMeal, int price, int meal) {
        return (dogsMeal + catsMeal) / meal * price;
    }

}
