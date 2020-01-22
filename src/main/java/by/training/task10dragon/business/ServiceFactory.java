package by.training.task10dragon.business;

import by.training.task10dragon.apiBusiness.DragonBuilder;
import by.training.task10dragon.apiBusiness.GrottoBuilder;

public class ServiceFactory {

    private static ServiceFactory instance;

    private ServiceFactory() {
    }
    public static ServiceFactory getInstance(){

        if(instance == null){

            instance = new ServiceFactory();
        }
        return instance;
    }

    public static GrottoBuilder getGrottoBuilder(){

        return GrottoBuilderImpl.getInstance();
    }
    public static DragonBuilder getDragonBuilder(){

        return DragonBuilderImpl.getInstance();
    }
}
