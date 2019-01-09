package task5;

public class Matrix {
    private int[][] arr;

    Matrix(int len) {
        arr = new int[len][len];
        for (int i = 0; i < len; i++)
            arr[i][i] = arr[i][len - i - 1] = 1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int[] anArr : arr) {
            for (int j = 0; j < arr[0].length; j++)
                str.append(anArr[j] + " ");
            str.append("\n");
        }
        return str.toString();
    }
}
