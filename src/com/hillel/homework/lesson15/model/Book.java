package com.hillel.homework.lesson15.model;

public class Book {

    private String name;
    private String description;
    private int year;
    Genre genre;
    Author author;

    public Book() {
    }

    public Book(String name, String description, int year, Genre genre) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String toString() {
        return "Назва книги: " + name + "Жанр: " + genre.getName() +
                "Автор: " + author + "Рік випуску: " + year;
    }
}
