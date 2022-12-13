package algorithmInClass.dp;

class Pair{
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
public class OptimalStrategy {
    public static void main(String[] args) {
        Pair[][] matrix = new Pair[4][4];
        int[] arr = {2,7,40,19};
        for (int i = 0; i < 4; i++) {
            matrix[i][i] = new Pair(arr[i],0);
        }
    }
}
