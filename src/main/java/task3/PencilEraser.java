package task3;

public class PencilEraser extends Pencil {
    private Eraser eraser;

    {
        name = "Pencil with Eraser";
    }

    public PencilEraser(String brand, double length, double slate, double price) {
        super(brand, length, slate, price);
        eraser = new Eraser();
    }

    @Override
    public void draw(String object) {
        System.out.println(object + " was drawn using "+ name+".");
    }

    public void erase() {
        eraser.erase();
    }
}
