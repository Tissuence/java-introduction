package com.hillel.homework.lesson13;

import java.io.IOException;

public class RealtyMain {

    public static void main(String[] args) throws IOException {

        Realty residentialProperty = new ResidentialProperty();
        residentialProperty.printCalculatedTax();

        Realty retailProperty = new RetailProperty();
        retailProperty.printCalculatedTax();

        Realty productionProperty = new ProductionProperty();
        productionProperty.printCalculatedTax();

    }


}
