package task3;

public class Eraser {
    private double level;

    public Eraser() {
        level = 100;
    }

    public void erase() {
        if (level > 0) {
            level -= 1;
            System.out.println("Erased. Eraser left: " + level + "%.");
        }
        else
            System.out.println("Can't erase. Eraser left: " + level + "%.");
    }
}
