package task6;

import org.junit.Test;

import static java.lang.Thread.sleep;

public class AtomicBoatTest {
    @Test
    public void test() throws InterruptedException {
        AtomicBoat atomicBoat = new AtomicBoat();

        atomicBoat.start();
        sleep(5000);
        atomicBoat.stop();
    }
}