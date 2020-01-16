package by.training.task10dragon.exception;

import org.apache.log4j.Logger;


public class TreasureException extends Exception{

    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(TreasureException.class);

    public TreasureException() {
        super();
    }

    public TreasureException(String message) {
       logger.info(message);
    }

    public TreasureException(Exception e) {
        super(e);
    }

    public TreasureException(String message, Exception e) {
        super(message, e);
    }

}
