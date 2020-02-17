package by.training.task10dragon.controller;

import by.training.task10dragon.controller.command.Command;

import java.util.Arrays;

public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String request) {

        String commandName;
        Command executionCommand;

        commandName = request.toUpperCase().trim();
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);

        return response;
    }
}
