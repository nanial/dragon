package by.training.task10dragon.view;

import by.training.task10dragon.bean.Dragon;
import by.training.task10dragon.controller.Controller;
import by.training.task10dragon.logic.api.DragonUtils;
import by.training.task10dragon.logic.api.GrottoUtils;
import by.training.task10dragon.logic.impl.DragonUtilsImpl;
import by.training.task10dragon.logic.impl.GrottoUtilsImpl;

public class Menu implements View {
    @Override
    public void userService() {
    GrottoUtils grottoUtils = new GrottoUtilsImpl();
            grottoUtils.fillingCollect();
            DragonUtils dragonUtils = new DragonUtilsImpl(new Dragon());
            System.out.println("Most expensive is " + dragonUtils.mostExpensive().toString());
            System.out.println();
            System.out.println(dragonUtils.showAllTreasure());
            System.out.println();
            System.out.println("Treasure of certain sum are " + dragonUtils.treasureCertainSum(25));
        Controller controller = new Controller();
        controller.executeTask("CERTAIN");
    }
}
