package algorithmInClass.heap;

public class Heap {
    public int[] getChildrenIdxs(int parentIdx){
        return new int[] {parentIdx*2+1,parentIdx*2+2};
    }

    public int[] makeHeap(int[] arr, int parentIdx){
        int leftIdx = parentIdx*2 + 1;
        int rightIdx = parentIdx*2 +2;
        int greaterIdx = parentIdx;

        if(leftIdx<arr.length && arr[leftIdx]>arr[greaterIdx])
            greaterIdx = leftIdx;

        if(rightIdx<arr.length && arr[rightIdx]>arr[rightIdx])
            greaterIdx = rightIdx;

        int tmp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = tmp;

        return arr;

    }
}
