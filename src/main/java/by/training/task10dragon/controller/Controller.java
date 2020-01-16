package by.training.task10dragon.controller;

import by.training.task10dragon.controller.command.Command;

public final class Controller {

    private final CommandProvider provider = new CommandProvider();
    private final char delimiter = ' ';

    public String executeTask(String request){

        String commandName;
        Command executionCommand;

        commandName = request.toUpperCase().trim();
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);

        return response;
    }
}
