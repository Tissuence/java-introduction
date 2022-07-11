package com.hillel.homework.lesson15.model;

public class Book {

    private String name;
    private String description;
    private int year;
    private Genre genre;
   private Author author;

    public Book() {
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
    public void setYear(int year) {
        this.year = year;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String toString() {
        return "Назва книги: " + name + " Жанр: " + genre.getName() +
                " Автор: " + author + " Рік випуску: " + year;
    }
}
