package com.hillel.homework.lesson15;

import com.hillel.homework.lesson15.view.AuthorView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AuthorView authorView = new AuthorView();
        authorView.addAuthor();
    }
}
