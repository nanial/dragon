package by.training.task10dragon.controller;

import by.training.task10dragon.controller.command.Command;
import by.training.task10dragon.controller.command.CommandName;
import by.training.task10dragon.controller.command.impl.CertainSum;
import by.training.task10dragon.controller.command.impl.MostExpensive;
import by.training.task10dragon.controller.command.impl.ShowTreasure;
import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.Map;

final class CommandProvider {

    private static final Logger logger = Logger.getLogger(CommandProvider.class);
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){

        repository.put(CommandName.CERTAIN, new CertainSum());
        repository.put(CommandName.EXPENSIVE, new MostExpensive());
        repository.put(CommandName.SHOW, new ShowTreasure());

    }

    Command getCommand(String name) {

        CommandName commandName;
        Command command;

        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);

        }catch(IllegalArgumentException | NullPointerException e){

            logger.trace("from command");
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
