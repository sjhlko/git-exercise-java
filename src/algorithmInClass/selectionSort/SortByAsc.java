package algorithmInClass.selectionSort;

public class SortByAsc implements Sort{
    @Override
    public int sort(int[] arr, int a, int b) {
        if(arr[a]>arr[b]){
            return b;
        }
        return a;
    }
}
