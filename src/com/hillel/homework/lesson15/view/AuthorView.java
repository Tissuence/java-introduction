package com.hillel.homework.lesson15.view;
import com.hillel.homework.lesson15.ActionType;
import com.hillel.homework.lesson15.model.Author;
import com.hillel.homework.lesson15.utils.Validator;

import java.io.IOException;
import java.util.List;

import static com.hillel.homework.lesson15.controller.AuthorController.AUTHORS;
import static com.hillel.homework.lesson15.controller.AuthorController.READER;

public class AuthorView {
    String title;

    public AuthorView() {
    }

    public Author createAuthor() throws IOException {
        Author author = new Author();
        title = "Введіть ім'я автора:";
        System.out.println(title);
        author.setName(Validator.validateInputText());
        title = "Введіть прізвище автора:";
        System.out.println(title);
        author.setSurname(Validator.validateInputText());
        return author;
    }

    public static void printAuthors(List<Author> AUTHORS) {
        for (int i = 0; i < AUTHORS.size(); i++) {
            System.out.println(i + "." + AUTHORS.get(i));
        }
    }

    public ActionType chooseAction() {
        System.out.println("Введіть ADD - щоб додати автора" + '\n' + "DELETE - видалити серед існуючих"
                + '\n' + "PRINT - вивести весь список авторів");
        ActionType actionType;
       try {
           actionType = ActionType.valueOf(READER.readLine());
       } catch (Exception exception) {
           return chooseAction();
       }
        return actionType;
    }

}
