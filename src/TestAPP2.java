import org.junit.Test;

import java.util.logging.*;

public class TestAPP2 {
    public static Logger logger = Logger.getLogger(MyAddMethod.class.getName());

@Test
public void test2() throws Exception{
    logger.setLevel(Level.INFO);
    Handler handler = new FileHandler("C:\\Users\\user\\IdeaProjects\\Lektion18-2\\LOG\\log");
    logger.addHandler(handler);

    Handler[] handlers = logger.getHandlers();
    handlers[0].setFormatter(new SimpleFormatter());
    logger.info("this is level info logging ");
    logger.info("this is level info logging ");
    logger.info("this is level info logging ");

    handlers[0].setFormatter(new SimpleFormatter());


    logger.log(Level.SEVERE,"THIS IS SEVERE LOGGNING");
    logger.log(Level.WARNING,"this is level warning logging");
    logger.log(Level.INFO,"this is level info  logging");
    System.out.println("Hello java logging APIs");



}
}