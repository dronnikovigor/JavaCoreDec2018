package task4;

import task3.Stationery;

import java.util.Comparator;

public class StationaryPriceComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        return (int)(o1.getPrice() - o2.getPrice());
    }
}
