package algorithmInClass.search;

import java.util.Scanner;

public class BinarySearch {
    //https://codeup.kr/problem.php?id=2083&rid=0
    //코드업 이분탐색
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        int targetNum =7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int targetNum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<targetNum){
                start = mid+1;
                continue;
            } else if (arr[mid]>targetNum) {
                end = mid-1;
                continue;
            } else {
                System.out.println(mid+1);
                return;
            }
        }
        System.out.println(-1);
    }
}
