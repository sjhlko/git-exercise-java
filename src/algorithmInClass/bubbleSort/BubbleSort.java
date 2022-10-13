package algorithmInClass.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
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
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[]={1,3,2,5,4};
        System.out.println(Arrays.toString(bs.sort(arr)));
    }
}
