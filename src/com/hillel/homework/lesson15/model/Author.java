package com.hillel.homework.lesson15.model;

import java.util.ArrayList;

public class Author {

    private String surname;
    private String name;
    private ArrayList<Book> books;

    public Author() {
    }

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Автор: " + name + " " + surname;
    }
}
