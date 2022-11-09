package algorithmInClass.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SortByAsc sortByAsc = new SortByAsc();
        SortByDesc sortByDesc = new SortByDesc();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int start = 0;
        while(start< arr.length){
            int swapIndex=start;
            for(int i=start;i< arr.length;i++){
                swapIndex = sortByDesc.sort(arr,i,swapIndex);
            }
            int tmp = arr[swapIndex];
            arr[swapIndex] = arr[start];
            arr[start] = tmp;
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
