package com.hillel.homework.lesson13;

import java.io.IOException;

public class ProductionProperty extends Realty {

    public ProductionProperty() {
        super();
    }
    public double readFromConsole() {
        System.out.println("Enter the area of production property in m" + '\u00B2' + ":");
        return super.readFromConsole();
    }

}
