package algorithmInClass.recursive;

import java.util.ArrayList;
import java.util.List;

public class Print100Times {
    public void print(int n){
        if(n>100)
            return;
        System.out.println(n);
        print(n+1);
    }
    public int plusList(List<Integer> list){
        if(list.isEmpty())
            return 0;
        return list.remove(0)+plusList(list);
    }

    public int plusArr(int[] arr, int index){
        if(index==arr.length)
            return 0;
        return arr[index]+plusArr(arr,index+1);
    }


    public static void main(String[] args) {
        Print100Times p = new Print100Times();
        p.print(1);
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);
        System.out.println(p.plusList(list));
        int[] arr = {7,3,2,9};
        System.out.println(p.plusArr(arr,0));

    }
}
