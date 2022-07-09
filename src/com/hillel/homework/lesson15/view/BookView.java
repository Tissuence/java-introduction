package com.hillel.homework.lesson15.view;

import com.hillel.homework.lesson15.model.Book;
import com.hillel.homework.lesson15.utils.Validator;

import java.io.IOException;

import static com.hillel.homework.lesson15.controller.AuthorController.AUTHORS;
import static com.hillel.homework.lesson15.controller.BookController.BOOKS;
import static com.hillel.homework.lesson15.controller.GenreController.GENRES;

public class BookView {
    private final AuthorView authorView;
    private final GenreView genreView;

    public BookView() {
        this.authorView = new AuthorView();
        this.genreView = new GenreView();
    }

    public Book createBook() throws IOException {
        Book book = new Book();
        System.out.println("Введіть назву книжки: ");
        book.setName(Validator.validateInputText());
        System.out.println("Введіть опис книжки: ");
        book.setDescription(Validator.validateInputText());
        System.out.println("Якого року надрукована книжка?");
        book.setYear(Validator.validateYear());
        System.out.println("Вкажіть жанр книжки, обравши зі списку.");
        book.setGenre(GENRES.get(genreView.chooseIndexOfGenre()));
        System.out.println("Хто написав книжку? Обери зі списку.");
        book.setAuthor(AUTHORS.get(authorView.chooseIndexOfAuthor()));
        return book;
    }

    public void printBooks() {
        if (BOOKS.isEmpty()) {
            System.out.println("Список книжок порожній!");
        } else {
            for (int i = 0; i < BOOKS.size(); i++) {
                System.out.println(i + 1 + "." + BOOKS.get(i));
            }
        }
    }

    public int chooseIndexOfBook() throws IOException {
        System.out.println("Введіть номер жанру який ви бажаєте обрати");
        printBooks();
        return Validator.validateIndex(BOOKS.size());
    }
}
