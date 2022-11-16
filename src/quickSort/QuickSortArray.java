package quickSort;

import java.util.Arrays;

public class QuickSortArray {
    public void sort(int[] arr){
        int pivot = arr[arr.length/2];
        int leftPointer = 0;
        int rightPointer = arr.length-1;
        while(leftPointer<=rightPointer){
            while(arr[leftPointer]<pivot)
                leftPointer++;
            while (arr[rightPointer]>pivot)
                rightPointer--;
            if(leftPointer<=rightPointer){
                int tmp = arr[leftPointer];
                arr[leftPointer]=arr[rightPointer];
                arr[rightPointer]=tmp;
                leftPointer++;
                rightPointer--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArray quickSortArray = new QuickSortArray();
        quickSortArray.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
