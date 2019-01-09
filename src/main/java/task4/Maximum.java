package task4;

import java.util.Random;

public class Maximum {
    private double[] arr;
    private double rangeMin = -100;
    private double rangeMax = 100;

    Maximum(int len) {
        arr = new double[2 * len];
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        }
    }

    public double countMax() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length / 2; i++) {
            double val;
            if ((val = arr[i] + arr[arr.length - i - 1]) > max) {
                max = val;
            }
        }
        return max;
    }
}
