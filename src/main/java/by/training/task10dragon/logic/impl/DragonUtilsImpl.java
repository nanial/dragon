package by.training.task10dragon.logic.impl;

import by.training.task10dragon.bean.Dragon;
import by.training.task10dragon.bean.Treasure;
import by.training.task10dragon.logic.api.DragonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DragonUtilsImpl implements DragonUtils {

    private Dragon dragon;

    public DragonUtilsImpl() {
    }

    public DragonUtilsImpl(Dragon dragon) {
        this.dragon = dragon;
    }

    public String showAllTreasure(){

       return Arrays.toString(dragon.getTreasures());
    }
    public Treasure mostExpensive(){

        long maxCost = 0;
        Treasure moreExpTreasure = new Treasure();

        for (Treasure t : dragon.getTreasures()) {

            if(t.getCost() > maxCost){
                maxCost = t.getCost();
            }
            if(t.getCost() == maxCost){
                moreExpTreasure = t;
            }
        }
        return moreExpTreasure;
    }

    public ArrayList<Treasure> treasureCertainSum(long certainSum){

        long sum = 0;
        ArrayList<Treasure> treasuresOfCertainSum = new ArrayList<>();

        Arrays.sort(dragon.getTreasures(), Comparator.comparing(Treasure::getCost));

        for (Treasure t : dragon.getTreasures()) {

            sum += t.getCost();

            if(sum <= certainSum){

                treasuresOfCertainSum.add(t);
            }
        }
        return treasuresOfCertainSum;
    }

}
