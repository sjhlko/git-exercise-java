package algorithmInClass.primeNumber;

import java.util.ArrayList;
import java.util.List;

public class Eratostenes {
    public static void main(String[] args) {
        int N = 50;
        List<Integer> pn = new ArrayList<>();
        for(int i=2;i<=N;i++){
            pn.add(i);
        }
        //조건을 N까지로 할경우 pn의 사이즈가줄어들며 인덱스를 넘어가는 오류 발생
        for (int i = 1; i < pn.size(); i++) {
            if(pn.get(i)%2==0)
                pn.remove(i);
        }
        System.out.println(pn);
    }
}
