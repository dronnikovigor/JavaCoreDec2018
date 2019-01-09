package task4;

import org.junit.Test;

public class MaximumTest {
    @Test
    public void test() {
        Maximum max = new Maximum(10);
        System.out.println(max.countMax());
    }
}