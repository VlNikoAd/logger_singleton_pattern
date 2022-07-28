import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int num = 1;

    private static Logger logger;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        SimpleDateFormat formatCurrentDate = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
        System.out.println("[" + formatCurrentDate.format(new Date()) + " " + num++ + "] " + msg);

    }
}
