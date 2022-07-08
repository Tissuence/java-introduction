package com.hillel.homework.lesson15.view;

import com.hillel.homework.lesson15.model.Author;
import com.hillel.homework.lesson15.model.Genre;
import com.hillel.homework.lesson15.utils.Validator;

import java.io.IOException;
import java.util.List;

public class GenreView {

    Genre genre;
    String title;

    public GenreView(Genre genre) {
        this.genre = genre;
    }

    public void getGenreInput() throws IOException {
      title = "Введіть назву жанру:";
        System.out.println(title);
        genre.setName(Validator.validateInputText());
        title = "Введіть назву жанру:";
        System.out.println(title);
        genre.setDescription(Validator.validateInputText());
    }

    public static void printGenres(List<Author> GENRES) {
        for (int i = 0; i < GENRES.size(); i++) {
            System.out.println(i + "." + GENRES.get(i));

        }
    }
}
