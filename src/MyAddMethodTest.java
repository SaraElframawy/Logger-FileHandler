import org.junit.Test;

import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class MyAddMethodTest {
    MyAddMethod myAddMethod = new MyAddMethod();
    Random random = new Random();
    public static final Logger LOGGER = Logger.getLogger(MyAddMethod.class.getName());

    int TemperValue;
    int tempResult = 0;
    @Test
    public void testAdd1() throws Exception {


        for (int i = 0; i < 5; i++) {
            TemperValue = random.nextInt(10);
            tempResult = TemperValue + 1;
            assertEquals(myAddMethod.add1(TemperValue), tempResult);
        }
        LOGGER.info("Testing the method add with :" + TemperValue);
        FileHandler handler = new FileHandler("File Handler");
        LOGGER.addHandler(handler);
        LOGGER.fine("finer message");

    }


    @Test
    public void Testadd3() throws Exception {


        for (int i = 0; i < 5; i++) {
            TemperValue = random.nextInt(10);
            tempResult = TemperValue + 3;
            LOGGER.info("this the method add 3: " + TemperValue);
            assertEquals(myAddMethod.add3(TemperValue), tempResult);
        }

        FileHandler handler = new FileHandler("File for logging");
        LOGGER.addHandler(handler);
    }


    @Test
    public void Testadd2() throws Exception {


        for (int i = 0; i < 5; i++) {
            TemperValue = random.nextInt(10);
            tempResult = TemperValue + 2;


            assertEquals(myAddMethod.add2(TemperValue), tempResult);
            LOGGER.info("this method add 2:" + TemperValue);
        }

        FileHandler handler = new FileHandler("using file hANDLER TO CREATE log");
        LOGGER.addHandler(handler);
    }
    @Test
    public void Testadd4 ()throws  Exception{
        for (int i =0;i<5;i++){
            TemperValue = random.nextInt(10);
            tempResult= TemperValue+4;
            assertEquals(MyAddMethod.add4(TemperValue),tempResult);
            LOGGER.info("this method to add 4 to"+TemperValue);

        }
        FileHandler handler = new FileHandler("reassuring handler file");
        LOGGER.addHandler(handler);
    }
}