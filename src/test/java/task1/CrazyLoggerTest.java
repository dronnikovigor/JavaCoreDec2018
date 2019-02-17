package task1;

import org.junit.BeforeClass;
import org.junit.Test;

public class CrazyLoggerTest {
    private static CrazyLogger logger;

    @BeforeClass
    public static void setUp() {
        logger = new CrazyLogger();
    }

    @Test
    public void test1() {
        logger.log("hello");
        logger.log("it's a HW");
        logger.log("number 3");
        logger.log("at EPAM Java Core");
        logger.log("Training Center");
        logger.log("to enter");
        logger.log("EPAM as Junior.");

        logger.show();
    }

    @Test
    public void test2() {
        System.out.println(logger.find("ello"));
        System.out.println(logger.find("EPAM"));
    }
}