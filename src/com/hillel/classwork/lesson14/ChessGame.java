package com.hillel.classwork.lesson14;

import java.util.ArrayList;

public class ChessGame {

    public static void main(String[] args) {

        ArrayList<ChessItem> chessItems = new ArrayList<>();

        ChessItem item = new Pawn();

        drawChessItems(chessItems);

    }

    private static void drawChessItems(ArrayList<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {
            chessItem.draw();
        }
    }

}
