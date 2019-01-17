package task2;

import task1.Stationery;

import java.util.Objects;

public class Pencil extends Stationery {
    private double length;
    private double slate;

    {
        name = "Pencil";
    }

    public Pencil(String brand, double length, double slate, double price) {
        this.brand = brand;
        this.length = length;
        this.slate = slate;
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSlate() {
        return slate;
    }

    public void setSlate(double slate) {
        this.slate = slate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pencil pencil = (Pencil) o;
        return Double.compare(pencil.length, length) == 0 &&
                Double.compare(pencil.slate, slate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, slate);
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "length=" + length +
                ", slate=" + slate +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
