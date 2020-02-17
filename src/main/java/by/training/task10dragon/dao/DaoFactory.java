package by.training.task10dragon.dao;

import by.training.task10dragon.apiDao.GrottoDao;

public class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();
    private final GrottoDao dao = new GrottoDaoImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance(){

        return instance;
    }

    public GrottoDao getDao() {
        return dao;
    }
}
