package by.training.task10dragon.controller.command;

import by.training.task10dragon.bean.Dragon;
import by.training.task10dragon.logic.api.DragonUtils;
import by.training.task10dragon.logic.impl.DragonUtilsImpl;

public interface Command {

    DragonUtils dragonUtils = new DragonUtilsImpl(new Dragon());
    String execute(String request);
}
