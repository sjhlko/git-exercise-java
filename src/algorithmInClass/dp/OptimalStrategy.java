package algorithmInClass.dp;

class Pair{
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
public class OptimalStrategy {
    public static void main(String[] args) {
        Pair[][] matrix = new Pair[4][4];
        int[] arr = {2,7,40,19};
        for (int i = 0; i < 4; i++) {
            matrix[i][i] = new Pair(arr[i],0);
            if(i>0){
                matrix[i][i-1] = new Pair(Math.max(arr[i],arr[i-1]),Math.min(arr[i],arr[i-1]));
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(matrix[i][i].toString());
        }
        for(int i = 1; i<arr.length;i++){
            System.out.println(matrix[i][i-1].toString());
        }
    }

}
