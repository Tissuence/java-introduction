package com.hillel.homework.lesson15.controller;

import com.hillel.homework.lesson15.ActionType;
import com.hillel.homework.lesson15.model.Author;
import com.hillel.homework.lesson15.view.AuthorView;
import com.hillel.homework.lesson15.view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorController {
    public static List<Author> AUTHORS = new ArrayList<>();
    AuthorView authorView;
    MainView mainView;
    public AuthorController() {
        this.authorView = new AuthorView();
        this.mainView = new MainView();
    }
    public void chooseAuthorAction() throws IOException {
        ActionType type = mainView.chooseAction("Автора");
        switch (type) {
            case ADD:
                addAuthor();
                break;
            case DELETE:
                AUTHORS.remove(authorView.chooseIndexOfAuthor());
                break;
            case PRINT:
                authorView.printAuthors();
                break;
        }
    }

    public void addAuthor() throws IOException {
        AUTHORS.add(authorView.createAuthor());
        System.out.println("Log: Автора додано до списку.");
    }
}
