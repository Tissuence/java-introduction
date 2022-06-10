package com.hillel.homework.lesson12;
public class HumansFamily {

    public static void main(String[] args) {

        Human child = new Human("Daughter", "Oksana", 12);
        Human.Mom mom = child.new Mom("Mom", "Maria", 34);
        Human.Dad dad = child.new Dad("Dad", "Ivan", 38);

        Object[] family = new Object[]{child, mom, dad};
        printArray(family);

     //   family.add(new Human.Mom("Mom", "Maria", 34)); буде питання
     //  family.add(new Human("Daughter", "Oksana", 12));
    }

    private static void printArray(Object[] family) {
        for (Object human : family) {
            System.out.print(human);
        }
    }
}
