package task2;

public class Count {
    private int len;
    private double[] arr;

    Count(int len) {
        this.len = len;
        arr = new double[len];
    }

    void count() {
        for (int i = 0; i < len; i++) {
            arr[i] = 1.0 / Math.pow((i + 1), 2);
        }
    }

    int getMinimum(double eps) {
        for (int i = 0; i < len; i++) {
            if (arr[i] < eps)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++) {
            str.append("arr[" + i + "] = " + arr[i] + "\n");
        }
        return str.toString();
    }
}
