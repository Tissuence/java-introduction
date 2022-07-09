package com.hillel.homework.lesson15.model;

public class Genre {
    private String name;
    private String description;

    public Genre() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Назва жанру: " + name + '\n' + "Опис: " + description;
    }
}
