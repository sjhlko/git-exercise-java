package quickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortArray {
    public void sort(int[] arr, int start, int end){
        int leftPointer = start;
        int rightPointer = end;
        if(leftPointer>=rightPointer)
            return;
        int pivotPointer = (rightPointer+leftPointer)/2;
        int pivot = arr[pivotPointer];
        while(leftPointer<rightPointer){
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

        sort(arr,start,rightPointer);
        sort(arr,leftPointer,end);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArray quickSortArray = new QuickSortArray();
        quickSortArray.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
