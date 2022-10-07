import java.util.logging.LogRecord;

public class JavaLogs {
    @Override
    public void publish(LogRecord record) {
        //add own logic to publish
        super.publish(record);
    }
    @Override
    public void flush() {
        super.flush();
    }
    @Override
    public void close() throws SecurityException {
        super.close();
    }

}
