package com.hillel.homework.lesson15.view;

import com.hillel.homework.lesson15.ActionType;
import com.hillel.homework.lesson15.ModelType;
import com.hillel.homework.lesson15.utils.Validator;

import java.util.Locale;

public class MainView {

    public ModelType chooseModel() {
        System.out.println("Введіть назву розділу, який вас цікавить: \n Author \n Genre \n Book ");
        ModelType modelType;
        try {
            modelType = ModelType.valueOf(Validator.validateInputText().toUpperCase(Locale.ROOT));
        } catch (Exception exception) {
            return chooseModel();
        }
        return modelType;
    }

    public ActionType chooseAction(String message) {
        System.out.println("Введіть Add - щоб додати " + message + '\n' + "Delete - видалити " + message + " серед існуючих"
                + '\n' + "Print - вивести весь список");
        ActionType actionType;
        try {
            actionType = ActionType.valueOf(Validator.validateInputText().toUpperCase(Locale.ROOT));
        } catch (Exception exception) {
            return chooseAction(message);
        }
        return actionType;
    }
}
