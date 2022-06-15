package com.hillel.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;

import static com.hillel.classwork.lesson13.Animal.DEFAULT_COLOR;

public class PetStore {

    public static void main(String[] args) {

        Animal cat = new Cat(DEFAULT_COLOR, "siam");
        Animal dog = new Dog();
        Animal cat2 = new Cat("ginger", "no");

        //Animal[] animals = new Animal[2];
        List<Animal> animals = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat("multi"));

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
