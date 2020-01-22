package by.training.task10dragon.logic.api;

import by.training.task10dragon.bean.Treasure;

public interface GrottoManager {

    default Treasure[] fillingCollect() {
        return new Treasure[0];
    }

    void writeInFile(Treasure[] treasures);
    Treasure [] treasures();
}
