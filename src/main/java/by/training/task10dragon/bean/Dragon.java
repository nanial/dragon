package by.training.task10dragon.bean;

import by.training.task10dragon.business.Factory;
import by.training.task10dragon.logic.api.Grotto;

import java.util.Arrays;

public class Dragon {

    Grotto grotto = new Factory().getGrottoBuilder().getGrotto();
    Treasure[] treasures = grotto.fillingCollect();

    public Dragon() {
    }

    public Grotto getGrottoUtilsImpl() {
        return grotto;
    }

    public void setGrotto(Grotto grotto) {
        this.grotto = grotto;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dragon)) return false;

        Dragon dragon = (Dragon) o;

        if (getGrottoUtilsImpl() != null ? !getGrottoUtilsImpl().equals(dragon.getGrottoUtilsImpl()) : dragon.getGrottoUtilsImpl() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getTreasures(), dragon.getTreasures());
    }

    @Override
    public int hashCode() {
        int result = getGrottoUtilsImpl() != null ? getGrottoUtilsImpl().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getTreasures());
        return result;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "grotto=" + grotto +
                ", treasures=" + Arrays.toString(treasures) +
                '}';
    }
}
