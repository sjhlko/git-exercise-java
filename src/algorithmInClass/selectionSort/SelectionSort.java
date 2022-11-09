package algorithmInClass.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int start = 0;
        while(start< arr.length){
            int minIndex=start;
            for(int i=start;i< arr.length;i++){
                if(arr[i]<arr[minIndex]){
                    minIndex = i;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = tmp;
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
