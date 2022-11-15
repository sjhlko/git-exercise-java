package quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    //강사님 풀이
    public List<Integer> sort(List<Integer> arr) {

        // 1. 기준값 뽑는 로직 구현
        int pivot = arr.get(arr.size() / 2); // 5
        System.out.println(pivot);
        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(pivot > arr.get(i)) left.add(arr.get(i));
            else if (pivot < arr.get(i)) right.add(arr.get(i));
        }
        System.out.println(left); //
        System.out.println(right); // 20, 18, 19, 25, 40, 50

        List<Integer> retList = new ArrayList<>();
        retList.addAll(sort(left));
        retList.add(pivot);
        retList.addAll(sort(right));
        return retList;
    }


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
