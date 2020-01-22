package by.training.task10dragon.business;

import by.training.task10dragon.apiBusiness.GrottoBuilder;
import by.training.task10dragon.logic.api.GrottoManager;
import by.training.task10dragon.logic.impl.GrottoManagerImpl;

public class GrottoBuilderImpl implements GrottoBuilder {

    private final GrottoManager grotto = new GrottoManagerImpl();
    private static GrottoBuilderImpl instance;

    private GrottoBuilderImpl() {

    }
    synchronized  public static GrottoBuilderImpl getInstance() {
        if(instance == null){
            instance = new GrottoBuilderImpl();
        }
        return instance;
    }

    @Override
    public GrottoManager getGrotto() {
        return grotto;
    }
}
