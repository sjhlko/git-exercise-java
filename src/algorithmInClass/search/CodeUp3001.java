package algorithmInClass.search;

import java.util.Scanner;

public class CodeUp3001 {
    //데이터 탐색
    //https://codeup.kr/problem.php?id=3001
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(k==arr[i]){
                System.out.println(i+1);
                return;
            }

        }
        System.out.println(-1);
    }


}