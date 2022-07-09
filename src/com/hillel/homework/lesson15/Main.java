package com.hillel.homework.lesson15;

import com.hillel.homework.lesson15.controller.AuthorController;
import com.hillel.homework.lesson15.model.Author;
import com.hillel.homework.lesson15.utils.Validator;
import com.hillel.homework.lesson15.view.AuthorView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

      AuthorController authorController = new AuthorController();
      authorController.chooseAuthorAction();


    }
}
