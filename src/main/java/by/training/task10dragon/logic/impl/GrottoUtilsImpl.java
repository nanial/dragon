package by.training.task10dragon.logic.impl;

import by.training.task10dragon.bean.Treasure;
import by.training.task10dragon.bean.TypeOfTreasure;
import by.training.task10dragon.logic.api.GrottoUtils;

import java.util.Random;

public class GrottoUtilsImpl implements GrottoUtils {

    private Treasure[] collectionOfTreasure = new Treasure[100];

    public Treasure[] fillingCollect(){

        for (int i = 0; i < collectionOfTreasure.length; i++) {

            Random r = new Random();
            collectionOfTreasure[i] =
                    (new Treasure((r.nextDouble() * 10),//weight
                            TypeOfTreasure.getTypeTreasure()));

            collectionOfTreasure[i].setCost((long) (collectionOfTreasure[i].getType().getPriceOfGramm() *
                                collectionOfTreasure[i].getWeight()));
        }

        return collectionOfTreasure;
    }

}
