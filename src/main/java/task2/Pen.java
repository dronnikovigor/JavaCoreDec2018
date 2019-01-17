package task2;

import java.util.Objects;

public class Pen extends Stationery {
    private Color color;
    private double ink;

    {
        name = "Pen";
    }

    public Pen(String brand, Color color, double ink, double price) {
        this.brand = brand;
        this.color = color;
        this.ink = ink;
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setInk(double ink) {
        this.ink = ink;
    }

    public Color getColor() {
        return color;
    }

    public double getInk() {
        return ink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.ink, ink) == 0 &&
                Objects.equals(name, pen.name) &&
                color == pen.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, ink, price);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", ink=" + ink +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
