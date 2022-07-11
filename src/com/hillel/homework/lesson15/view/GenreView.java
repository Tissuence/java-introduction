package com.hillel.homework.lesson15.view;

import com.hillel.homework.lesson15.model.Genre;
import com.hillel.homework.lesson15.utils.Validator;

import java.io.IOException;

import static com.hillel.homework.lesson15.controller.GenreController.GENRES;

public class GenreView {

    public GenreView() {
    }

    public Genre createGenre() throws IOException {
        Genre genre = new Genre();
        System.out.println("Введіть назву жанру:");
        genre.setName(Validator.validateInputText());
        System.out.println("Введіть опис жанру:");
        genre.setDescription(Validator.validateInputText());
        return genre;
    }

    public void printGenres() {
        for (int i = 0; i < GENRES.size(); i++) {
            System.out.println(i + 1 + "." + GENRES.get(i));
        }
        if (GENRES.isEmpty()) {
            System.out.println("Список пустий!");
        }
    }

    public int chooseIndexOfGenre() throws IOException {
        System.out.println("Введіть номер жанру який ви бажаєте обрати");
        printGenres();
        return Validator.validateIndex(GENRES.size());
    }
}
