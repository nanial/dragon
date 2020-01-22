package by.training.task10dragon.logic.impl;

import by.training.task10dragon.apiDao.GrottoDao;
import by.training.task10dragon.bean.Treasure;
import by.training.task10dragon.bean.TypeOfTreasure;
import by.training.task10dragon.dao.DaoFactory;
import by.training.task10dragon.logic.api.GrottoManager;

import java.util.Random;

public class GrottoManagerImpl implements GrottoManager {

    private Treasure[] collectionOfTreasure = new Treasure[100];
    GrottoDao dao = DaoFactory.getInstance().getDao();

    public Treasure[] fillingCollect(){

        for (int i = 0; i < collectionOfTreasure.length; i++) {

            Random r = new Random();
            collectionOfTreasure[i] =
                    (new Treasure((r.nextDouble() * 10),//weight
                            TypeOfTreasure.getTypeTreasure()));

            collectionOfTreasure[i].setCost((long) (collectionOfTreasure[i].getType().getPriceGramm() *
                                collectionOfTreasure[i].getWeight()));
        }

        return collectionOfTreasure;
    }

    @Override
    public void writeInFile(Treasure[] treasures) {
        dao.writeInFile(treasures);
    }

    @Override
    public Treasure[] treasures() {
        return dao.treasures();
    }//read from file

}
