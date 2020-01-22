package by.training.task10dragon.business;

import by.training.task10dragon.apiBusiness.DragonBuilder;
import by.training.task10dragon.bean.Dragon;

public class DragonBuilderImpl implements DragonBuilder {

    private Dragon dragon;
    private static DragonBuilderImpl instance;

    private DragonBuilderImpl() {
        this.dragon = new Dragon();
    }
    synchronized  public static DragonBuilderImpl getInstance() {

        if(instance == null){
            instance = new DragonBuilderImpl();
        }
        return instance;
    }

    @Override
    public Dragon getDragon() {
        return dragon;
    }
}
