package task4;

import task3.Stationery;

import java.util.Comparator;

public class StationaryNameComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
