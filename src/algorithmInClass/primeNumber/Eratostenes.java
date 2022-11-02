package algorithmInClass.primeNumber;

import java.util.ArrayList;
import java.util.List;

public class Eratostenes {
    public static void main(String[] args) {
        int N = 50;
        List<Integer> pn = new ArrayList<>();
        for(int i=1;i<=N;i++){
            pn.add(i);
        }
        for (int i = 0; i <N; i++) {
            if(pn.get(i)%2==0)
                pn.remove(i);
        }
        System.out.println(pn);
    }
}
