package task3;

import org.junit.Test;

public class StationaryTest {

    @Test
    public void test() {
        Pen pen = new Pen("Pilot", Color.BLUE, 56.4, 99.0);
        Pencil pencil = new Pencil("Pilot", 60.0, 56.4, 99.0);
        PencilEraser pencilEr = new PencilEraser("Pilot2", 60.0, 56.4, 99.0);

        pencilEr.draw("cat");
        pencil.draw("dog");
        pen.draw("ball");

        pencilEr.erase();
    }

}