package algorithmInClass.radixSort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr,-1);
        int[] notSorted = {7,4,5,9,1,0};
        for (int x:notSorted) {
            arr[x]=x;
        }
        for (int x:arr) {
            if(x!=-1)
                System.out.println(x);
        }
    }
}
