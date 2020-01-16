package by.training.task10dragon.logic.api;

import by.training.task10dragon.bean.Treasure;

import java.util.ArrayList;

public interface DragonUtils {

    String showAllTreasure();
    Treasure mostExpensive();
    ArrayList<Treasure> treasureCertainSum(long certainSum);
}
