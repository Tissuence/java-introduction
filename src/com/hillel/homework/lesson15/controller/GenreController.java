package com.hillel.homework.lesson15.controller;

import com.hillel.homework.lesson15.ActionType;
import com.hillel.homework.lesson15.model.Genre;
import com.hillel.homework.lesson15.view.GenreView;
import com.hillel.homework.lesson15.view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenreController {
    public static List<Genre> GENRES = new ArrayList<>();
    private final GenreView genreView;
    private final MainView mainView;

    public GenreController() {
        this.genreView = new GenreView();
        this.mainView = new MainView();
    }

    public void chooseGenreAction() throws IOException {
        ActionType type = mainView.chooseAction("жанр");
        switch (type) {
            case ADD -> addGenre();
            case DELETE -> deleteGenre();
            case PRINT -> genreView.printGenres();
        }
    }

    private void deleteGenre() throws IOException {
        System.out.println("Log: Жанр видалено.");
        GENRES.remove(genreView.chooseIndexOfGenre());
    }

    public void addGenre() throws IOException {
        GENRES.add(genreView.createGenre());
        System.out.println("Log: Жанр додано до списку.");
    }
}
