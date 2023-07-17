package Projekt;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    private static final String log_file = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Projekt\\logfile.log";

    static {
        try {
            FileHandler fileHandler = new FileHandler(log_file, true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void log(String message) {
        logger.log(Level.INFO, (new Date() + " " + message + "\n"));
    }
}
