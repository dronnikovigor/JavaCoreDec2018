package task1;

import java.util.Objects;

enum Color {
    RED,
    GREEN,
    BLUE,
    BLACK
}

public class Pen {
    private String brand;
    private Color color;
    private double ink;
    private double price;

    public Pen(String brand, Color color, double ink, double price) {
        this.brand = brand;
        this.color = color;
        this.ink = ink;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setInk(double ink) {
        this.ink = ink;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public double getInk() {
        return ink;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.ink, ink) == 0 &&
                Double.compare(pen.price, price) == 0 &&
                Objects.equals(brand, pen.brand) &&
                color == pen.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, ink, price);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", ink=" + ink +
                ", price=" + price +
                '}';
    }
}
