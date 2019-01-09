package task2;

import org.junit.Test;

public class CountTest {

    @Test
    public void test() {
        Count count = new Count(10);
        count.count();
        System.out.println(count.toString());
        System.out.println(count.getMinimum(0.05));
    }
}