package task2;

import org.junit.Test;

public class WorkerTest {
    @Test
    public void test() {
        Desktop desktop = new Desktop();
        desktop.addToDesktop(new Pen("Pilot", Color.BLUE, 56.4, 99.0));
        desktop.addToDesktop(new Pen("Komus", Color.BLACK, 56.4, 89.0));
        desktop.addToDesktop(new Pencil("Komus", 10.0, 56.4, 69.8));

        Worker worker1 = new Worker("worker 1", desktop);
        System.out.println(worker1.getDesktop().countStationeryPrice());
    }

}