package task3;

import org.junit.Test;

public class FunctionTest {

    @Test
    public void test() {
        Function func = new Function();
        func.count(10.1, 20.6, 1.2);
        System.out.println(func.toString());
    }
}