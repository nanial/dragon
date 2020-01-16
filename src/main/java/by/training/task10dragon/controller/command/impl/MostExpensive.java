package by.training.task10dragon.controller.command.impl;

import by.training.task10dragon.controller.command.Command;

public class MostExpensive implements Command {

    @Override
    public String execute(String request) {

        return dragonUtils.mostExpensive().toString();
    }
}
