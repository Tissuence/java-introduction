package com.hillel.homework.lesson15.controller;

import com.hillel.homework.lesson15.utils.Validator;
import com.hillel.homework.lesson15.view.MainView;

import java.io.IOException;

public class MainController {
    MainView mainView;
    AuthorController authorController;
    GenreController genreController;
    BookController bookController;

    public MainController() {
        this.authorController = new AuthorController();
        this.genreController = new GenreController();
        this.bookController = new BookController();
        this.mainView = new MainView();
    }

    public void startApp() throws IOException {
        do {
            switch (mainView.chooseModel()) {
                case AUTHOR -> authorController.chooseAuthorAction();
                case GENRE -> genreController.chooseGenreAction();
                case BOOK -> bookController.chooseBookAction();
            }
            System.out.println(" Бажаєте продовжити роботу? Yes або no ");
        } while (!Validator.validateInputText().equalsIgnoreCase("no"));
    }
}
