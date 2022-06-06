package com.hillel.homework.lesson11;

public class CatMain {

    public static void main(String[] args) {

        Cat cat = new Cat("Lussie", 2, 4, "Sphinx" );
        Cat cat1 = new Cat("Jack", 5);
        Cat cat2 = new Cat("Kitty", 2, 4, "Siamese");

        System.out.println(compareCats(cat, cat1));
        System.out.println(compareCats(cat, cat2));
    }

    public static String compareCats(Cat cat, Cat cat1) {
       String answer =  (cat.age == cat1.age && cat.weight == cat1.weight) ? "Age and weight of " + cat.name + " and " + cat1.name  + " is equals." : "Age and weight of " + cat.name + " and " + cat1.name  + " is not equals.";
        return answer;
    }
}
