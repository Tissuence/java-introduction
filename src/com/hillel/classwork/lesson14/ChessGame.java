package com.hillel.classwork.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChessGame {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<ChessItem> chessItems = new ArrayList<>();
String input;
        System.out.println("Input chess item name:");
while (!(input = READER.readLine()).equals("stop")){

        }

        chessItems.add(createChessItem(input));

        drawChessItems(chessItems);

        Drawable chessboard = new ChessBoard();
        draw(chessboard);

    }

    public static ChessItem createChessItem(String chessItemName) throws IOException {
        switch (chessItemName) {
            case "pawn":
                return new Pawn();
            case "queen":
                return new Queen();
            case "king":
                return new King();
            default:
                throw new IllegalArgumentException("Unknown chess item name!" + chessItemName);

        }
    }

    private static void draw(Drawable drawable) {
        drawable.draw();
    }


    private static void drawChessItems(ArrayList<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {

            /*if (chessItem instanceof Drawable) {
                Drawable drawableChessItem = (Drawable) chessItem;
                drawableChessItem.draw();
            }*/
            chessItem.draw();
        }
    }

}
