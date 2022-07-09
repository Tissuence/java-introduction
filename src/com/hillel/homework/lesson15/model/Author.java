package com.hillel.homework.lesson15.model;

public class Author {
    private String surname;
    private String name;

    public Author() {
    }

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Автор: " + name + " " + surname;
    }
}
