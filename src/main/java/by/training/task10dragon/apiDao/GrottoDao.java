package by.training.task10dragon.apiDao;

import by.training.task10dragon.bean.Treasure;

public interface GrottoDao {

    void writeInFile(Treasure[] treasures);
    Treasure [] treasures();
}
