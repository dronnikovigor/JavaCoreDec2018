package task2;

import task1.Stationery;

import java.util.ArrayList;

public class Desktop {
    ArrayList<Stationery> desktop;

    public Desktop() {
        desktop = new ArrayList<>();
    }

    public void addToDesktop(Stationery object) {
        desktop.add(object);
    }

    public double countStationeryPrice() {
        double sum = 0;
        for (Stationery obj : desktop) {
            sum += obj.getPrice();
        }
        return sum;
    }

}
