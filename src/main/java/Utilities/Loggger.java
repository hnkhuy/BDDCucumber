package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * Created by huy.huynh on 15/09/2018.
 */
public class Loggger {

    public static Logger getLogger(Class page) {
        Logger logger = LogManager.getLogger(page);
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        File file = new File("src/main/resources/config/log4j2.xml");
        context.setConfigLocation(file.toURI());
        return logger;
    }
}
