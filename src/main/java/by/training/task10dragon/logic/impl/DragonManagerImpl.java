package by.training.task10dragon.logic.impl;

import by.training.task10dragon.apiDao.GrottoDao;
import by.training.task10dragon.bean.Dragon;
import by.training.task10dragon.bean.Treasure;
import by.training.task10dragon.dao.DaoFactory;
import by.training.task10dragon.logic.api.DragonManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DragonManagerImpl implements DragonManager {

    private Dragon dragon;

    GrottoDao dao = DaoFactory.getInstance().getDao();

    public DragonManagerImpl() {
    }
    public DragonManagerImpl(GrottoDao dao) {
        this.dao = dao;
    }

    public DragonManagerImpl(Dragon dragon) {
        this.dragon = dragon;
    }

    public String showAllTreasure(){

       return Arrays.toString(dao.treasures());
    }
    public Treasure mostExpensive(){

        long maxCost = 0;
        Treasure mostExpTreasure = new Treasure();

        for (Treasure t : dao.treasures()) {

            if(t.getCost() > maxCost){
                maxCost = t.getCost();
            }
            if(t.getCost() == maxCost){
                mostExpTreasure = t;
            }
        }
        return mostExpTreasure;
    }

    public ArrayList<Treasure> treasureCertainSum(long certainSum){

        long sum = 0;
        ArrayList<Treasure> treasuresOfCertainSum = new ArrayList<>();

        Arrays.sort(dao.treasures(), Comparator.comparing(Treasure::getCost));

        for (Treasure t : dao.treasures()) {

            sum += t.getCost();

            if(sum <= certainSum){

                treasuresOfCertainSum.add(t);
            }
        }
        return treasuresOfCertainSum;
    }
}
