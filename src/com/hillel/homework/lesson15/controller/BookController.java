package com.hillel.homework.lesson15.controller;

import com.hillel.homework.lesson15.ActionType;
import com.hillel.homework.lesson15.model.Book;
import com.hillel.homework.lesson15.view.BookView;
import com.hillel.homework.lesson15.view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.hillel.homework.lesson15.controller.AuthorController.AUTHORS;
import static com.hillel.homework.lesson15.controller.GenreController.GENRES;

public class BookController {
    public static List<Book> BOOKS = new ArrayList<>();
    private final BookView bookView;
    private final MainView mainView;
    private final GenreController genreController;
    private final AuthorController authorController;

    public BookController() {
        this.bookView = new BookView();
        this.mainView = new MainView();
        this.genreController = new GenreController();
        this.authorController = new AuthorController();
    }

    public void chooseBookAction() throws IOException {
        ActionType type = mainView.chooseAction("книжку");
        switch (type) {
            case ADD:
                addBook();
                break;
            case DELETE:
                deleteBook();
                break;
            case PRINT:
                bookView.printBooks();
                break;
        }
    }

    private void addBook() throws IOException {
        if (GENRES.isEmpty()) {
            genreController.addGenre();
        }
        if (AUTHORS.isEmpty()) {
            authorController.addAuthor();
        }
        BOOKS.add(bookView.createBook());
        System.out.println("Log: Книжку додано до списку.");
    }

    private void deleteBook() throws IOException {
        BOOKS.remove(bookView.chooseIndexOfBook());
        System.out.println("Log: Книжку видалено.");
    }
}
