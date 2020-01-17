package by.training.task10dragon.business;

import by.training.task10dragon.apiBusiness.GrottoBuilder;
import by.training.task10dragon.logic.api.Grotto;
import by.training.task10dragon.logic.impl.GrottoImpl;

public class GrottoBuilderImpl implements GrottoBuilder {

    private Grotto grotto;
    private static GrottoBuilderImpl instance;

    private GrottoBuilderImpl() {
        this.grotto = new GrottoImpl();
    }
    synchronized  public static GrottoBuilderImpl getInstance() {
        if(instance == null){
            instance = new GrottoBuilderImpl();
        }
        return instance;
    }

    @Override
    public Grotto getGrotto() {
        return grotto;
    }
}
