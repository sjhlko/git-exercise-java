package algorithmInClass.primeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratostenes {
    public static void main(String[] args) {
        int N = 50;
//        List<Integer> pn = new ArrayList<>();
//        for(int i=2;i<=N;i++){
//            pn.add(i);
//        }
        //이렇게 add remove를 계속 할경우 시간이 너무 오래걸림
//        for(int j=2;j*j<=N;j++){
//            //조건을 N까지로 할경우 pn의 사이즈가줄어들며 인덱스를 넘어가는 오류 발생
//            for (int i = 1; i < pn.size(); i++) {
//                if(pn.get(i)%j==0&&pn.get(i)!=j)
//                    pn.remove(i);
//            }
//        }

        int[] pn = new int[51];
        for (int i = 2; i <= N; i++) {
            pn[i]=i;
        }
        for (int i = 2; i*i <= N; i++) {
            for(int j=i+1;j<=N;j++){
                if(pn[j]%i==0)
                    pn[j]=-1;
            }
        }
        for (int i = 2; i <= N ; i++) {
            if(pn[i]!=-1)
                System.out.println(pn[i]);
        }
    }
}
