package by.training.task10dragon.dao;

import by.training.task10dragon.apiDao.GrottoDao;
import by.training.task10dragon.bean.Treasure;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class GrottoDaoImpl implements GrottoDao {

    @Override
    public void writeInFile(Treasure[] treasures) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\by.training.dragon\\treasure.xml")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(treasures);
        encoder.close();
    }

    @Override
    public Treasure[] treasures() {

        Treasure[] treasures = null;

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\by.training.dragon\\treasure.xml")));

            treasures = (Treasure[]) decoder.readObject();


        } catch (FileNotFoundException io) {
            io.getMessage();
        }
        return treasures;
    }
}
