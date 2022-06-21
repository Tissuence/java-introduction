package com.hillel.classwork.lesson14;

public abstract class ChessItem {

    protected int x, y;
    protected int value;

    public int getValue() {
        return value;
    }

    public abstract void draw();
}
