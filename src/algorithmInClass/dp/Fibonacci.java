package algorithmInClass.dp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        arr[1] = 1; arr[2] = 1;
        for (int i = 3; i <= size; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[size]);
    }
}
