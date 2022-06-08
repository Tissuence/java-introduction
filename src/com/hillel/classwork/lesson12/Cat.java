package com.hillel.classwork.lesson12;

public class Cat {

    private  String name;
    private final int age;
    private final int weight;
    private final int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String catFight(Cat cat) {
        String winner;
        if ((this.strength > cat.strength && this.weight > cat.weight) || (this.age > cat.age && this.strength > cat.strength)) {
            winner = this.name;
        } else if ((this.strength < cat.strength && this.weight < cat.weight) || (this.age < cat.age && this.strength < cat.strength)) {
            winner = cat.name;
        } else {
            winner = null;
        } return winner;
    }
}
