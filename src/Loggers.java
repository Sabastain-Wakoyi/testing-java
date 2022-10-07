import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Loggers {

    static Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
}
