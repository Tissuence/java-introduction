package com.hillel.homework.lesson15.view;

import com.hillel.homework.lesson15.ActionType;

import static com.hillel.homework.lesson15.controller.AuthorController.READER;

public class MainView {

    public ActionType chooseAction() {
        System.out.println("Введіть ADD - щоб додати" + '\n' + "DELETE - видалити серед існуючих"
                + '\n' + "PRINT - вивести весь список");
        ActionType actionType;
        try {
            actionType = ActionType.valueOf(READER.readLine());
        } catch (Exception exception) {
            return chooseAction();
        }
        return actionType;
    }
}
