package by.training.task10dragon.controller.command.impl;

import by.training.task10dragon.controller.command.Command;

public class CertainSum implements Command {
    @Override

    public String execute(String request) {

        return dragonManager.treasureCertainSum(25).toString();
    }
}
