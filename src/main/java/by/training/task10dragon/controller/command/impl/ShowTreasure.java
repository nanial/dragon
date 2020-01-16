package by.training.task10dragon.controller.command.impl;

import by.training.task10dragon.controller.command.Command;

public class ShowTreasure implements Command {
    @Override
    public String execute(String request) {

        return dragonUtils.showAllTreasure();
    }
}
