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

    /* 강사님 풀이
interface StatementStrategy {
   boolean apply(int a, int b);
}


// interface를 선언하고
// Template Callback패턴

public class SelectionSort {
   public int[] selectionSort(int[] arr, StatementStrategy stmt) {
       for (int i = 0; i < arr.length - 1; i++) {
           int minIdx = i;
           for (int j = i; j < arr.length; j++) {
               if (stmt.apply(arr[minIdx], arr[j])) minIdx = j;
           }
           int temp = arr[i];
           arr[i] = arr[minIdx];
           arr[minIdx] = temp;
           System.out.println(Arrays.toString(arr));
       }
       return arr;
   }

   public static void main(String[] args) {
       int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
       SelectionSort ss = new SelectionSort();
       ss.selectionSort(arr, (a, b) -> a < b);
       ss.selectionSort(arr, (a, b) -> a > b);
   }
}
    * */
}
