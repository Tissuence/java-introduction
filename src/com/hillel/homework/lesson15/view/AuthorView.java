package com.hillel.homework.lesson15.view;

import com.hillel.homework.lesson15.model.Author;
import com.hillel.homework.lesson15.utils.Validator;

import java.io.IOException;

import static com.hillel.homework.lesson15.controller.AuthorController.AUTHORS;

public class AuthorView {

    public AuthorView() {
    }

    public Author createAuthor() throws IOException {
        Author author = new Author();
        System.out.println("Введіть ім'я автора:");
        author.setName(Validator.validateInputText());
        System.out.println("Введіть прізвище автора:");
        author.setSurname(Validator.validateInputText());
        return author;
    }

    public void printAuthors() {
        for (int i = 0; i < AUTHORS.size(); i++) {
            System.out.println(i + 1 + "." + AUTHORS.get(i));
        }
        if (AUTHORS.isEmpty()) {
            System.out.println("Список пустий!");
        }
    }

    public int chooseIndexOfAuthor() throws IOException {
        System.out.println("Введіть номер автора,y якого ви бажаєте обрати");
        printAuthors();
        return Validator.validateIndex(AUTHORS.size());
    }
}
