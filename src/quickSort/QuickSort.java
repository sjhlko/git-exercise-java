package quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        int pivot = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i : arr) {
            if(pivot>=i)
                right.add(i);
            else left.add(i);
        }
    }
}
