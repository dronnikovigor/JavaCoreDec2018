package task4;

import org.junit.Test;
import task3.*;

import java.util.Comparator;
import java.util.TreeSet;

public class StationaryTest {
    @Test
    public void testName() {
        Comparator<Stationery> stationeryComparator = new StationaryNameComparator();
        TreeSet<Stationery> kit = new TreeSet<>(stationeryComparator);
        kit.add(new Pen("Pilot", Color.BLUE, 56.4, 99.0));
        kit.add(new Pencil("Pilot", 60.0, 56.4, 67.0));
        kit.add(new PencilEraser("Pilot2", 60.0, 56.4, 96.0));
        for(Stationery  stationery : kit){
            System.out.println(stationery.toString());
        }
    }

    @Test
    public void testPrice() {
        Comparator<Stationery> stationeryComparator = new StationaryPriceComparator();
        TreeSet<Stationery> kit = new TreeSet<>(stationeryComparator);
        kit.add(new Pen("Pilot", Color.BLUE, 56.4, 99.0));
        kit.add(new Pencil("Pilot", 60.0, 56.4, 67.0));
        kit.add(new PencilEraser("Pilot2", 60.0, 56.4, 96.0));
        for(Stationery  stationery : kit){
            System.out.println(stationery.toString());
        }
    }

    @Test
    public void testAll() {
        Comparator<Stationery> stationeryComparator = new StationaryNameComparator()
                .thenComparing(new StationaryPriceComparator());
        TreeSet<Stationery> kit = new TreeSet<>(stationeryComparator);
        kit.add(new Pen("Pilot", Color.BLUE, 56.4, 99.0));
        kit.add(new Pencil("Pilot", 60.0, 56.4, 67.0));
        kit.add(new PencilEraser("Pilot2", 60.0, 56.4, 96.0));
        for(Stationery  stationery : kit){
            System.out.println(stationery.toString());
        }
    }

}