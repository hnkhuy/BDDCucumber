import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        File file = new File("src/main/resources/config/log4j2.xml");
        context.setConfigLocation(file.toURI());

//        LOGGER.setLevel(Level.INFO);

        LOGGER.trace("Trace Message!");
        LOGGER.debug("Debug Message!");
        LOGGER.info("Info Message!");
        LOGGER.warn("Warn Message!");
        LOGGER.error("Error Message!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        LOGGER.fatal("Fatal Message!");
//        System.out.println("log4jConfPath = " + log4jConfPath);
//        System.out.println("file = " + file.getAbsolutePath());
    }
}
