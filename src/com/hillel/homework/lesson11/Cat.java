package com.hillel.homework.lesson11;

import com.hillel.classwork.lesson11.Dog;

public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat() {
        System.out.println("Meow!");
    }

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            if (this.weight == cat.weight && this.age == cat.age) {
                return true;
            }
        }
        return false;
    }

   /* public boolean equalsCat(Cat cat, Cat cat1) {
        if (cat.age == cat1.age && cat.weight == cat1.weight) {
            System.out.println("Age and weight of cats is equals.");
        }

    }*/

}
