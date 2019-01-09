package task3;

public class Function {
    private double[][] arr;

    public void count(double from, double to, double h) {
        arr = new double[(int)((to-from)/h)+1][2];
        double x = from;
        int i = 0;
        while (x < to) {
            arr[i][0] = x;
            arr[i++][1] = Math.tan(2*x)-3;
            x += h;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(String.format("| %.4f \t| %.4f \t|\n", arr[i][0], arr[i][1]));
        }
        return str.toString();
    }
}
