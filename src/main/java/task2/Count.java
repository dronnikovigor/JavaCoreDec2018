package task2;

public class Count {
    private double[] arr;

    Count(int len) {
        arr = new double[len];
    }

    void count() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0 / Math.pow((i + 1), 2);
        }
    }

    int getMinimum(double eps) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < eps)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append("arr[" + i + "] = " + arr[i] + "\n");
        }
        return str.toString();
    }
}
