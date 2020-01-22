package by.training.task10dragon.controller.command;

import by.training.task10dragon.business.ServiceFactory;
import by.training.task10dragon.logic.api.DragonManager;
import by.training.task10dragon.logic.impl.DragonManagerImpl;

public interface Command {

    DragonManager dragonUtils = new DragonManagerImpl(
            ServiceFactory.getDragonBuilder().getDragon()
    );
    String execute(String request);
}
