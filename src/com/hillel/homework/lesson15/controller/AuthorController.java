package com.hillel.homework.lesson15.controller;

import com.hillel.homework.lesson15.ActionType;
import com.hillel.homework.lesson15.model.Author;
import com.hillel.homework.lesson15.view.AuthorView;
import com.hillel.homework.lesson15.view.MainView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AuthorController {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static List<Author> AUTHORS = new ArrayList<>();
    AuthorView authorView;
    MainView mainView;
    public AuthorController() {
        this.authorView = new AuthorView();
        this.mainView = new MainView();
    }
    public void chooseAuthorAction() throws IOException {
        ActionType type = mainView.chooseAction();
        switch (type) {
            case ADD:
                AUTHORS.add(authorView.createAuthor());
                System.out.println("Log: Автора додано до списку.");
                break;
            case DELETE:
                AUTHORS.remove(authorView.chooseIndexOfAuthor());
            case PRINT:
                authorView.printAuthors(AUTHORS);
        }
    }
}
