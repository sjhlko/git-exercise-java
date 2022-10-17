package algorithmInClass.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    // K-sort 경록 소트
    // 버블소트는 인접한 인덱스의 값을 비교함
    // 하지만 여기서는 n번째와 n+1, n+2..번째를 다 비교함
    // 선택과 버블의 중간정도..?
    public int[] sort(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
    public int[] bubblesort(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[]={1,3,2,5,4};
        System.out.println(Arrays.toString(bs.sort(arr)));
    }
}
