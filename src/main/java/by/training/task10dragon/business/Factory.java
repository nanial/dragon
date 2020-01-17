package by.training.task10dragon.business;

import by.training.task10dragon.apiBusiness.GrottoBuilder;

public class Factory {

    public static GrottoBuilder getGrottoBuilder(){

        return GrottoBuilderImpl.getInstance();
    }
}
