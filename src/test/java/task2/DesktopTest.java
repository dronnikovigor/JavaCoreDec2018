package task2;

import org.junit.Test;

public class DesktopTest {

    @Test
    public void test() {
        Desktop desktop = new Desktop();

        desktop.addToDesktop(new Pen("Pilot", Color.BLUE, 56.4, 99.0));
        System.out.println(desktop.countStationeryPrice());

        desktop.addToDesktop(new Pen("Komus", Color.BLACK, 56.4, 89.0));
        desktop.addToDesktop(new Pencil("Komus", 10.0, 56.4, 69.8));
        System.out.println(desktop.countStationeryPrice());
    }

}