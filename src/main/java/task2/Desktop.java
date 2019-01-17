package task2;

import java.util.ArrayList;

public class Desktop {
    private ArrayList<Stationery> desktop;

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
