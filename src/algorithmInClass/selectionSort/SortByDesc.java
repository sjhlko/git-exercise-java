package algorithmInClass.selectionSort;

public class SortByDesc implements Sort{
    @Override
    public int sort(int[] arr, int a, int b) {
        if(arr[a]>arr[b]){
            return a;
        }
        return b;
    }
}
