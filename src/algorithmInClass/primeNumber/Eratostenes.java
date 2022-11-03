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

//        int[] pn = new int[N+1];
//
//
//        for (int i = 2; i <= N; i++) {
//            pn[i]=i;
//        }

        //자기 자신을 제외한 배수들을 지우기 위해 자기 자신이 아닌 배수들중에 가장 작은 배열 출력
        //에라토스테네스 체의 속도 개선의 핵심은
        // 1. list를 사용할때 add remove 하지 않기
        // 2. 전체배열을 다 확인하여 배수를 지우는게 아니라 배수에만 접근하여 지울 수 있음


        //이렇게 할 경우 배열을 매번 전부 접근하기때문에 비효율적
//        for (int i = 2; i*i <= N; i++) {
//            for(int j=i+1;j<=N;j++){
//                if(pn[j]%i==0)
//                    pn[j]=-1;
//            }
//        }
//        for (int i = 2; i <= N ; i++) {
//            if(pn[i]!=-1)
//                System.out.println(pn[i]);
//        }

        //2~50까지 N-1개
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks,true); //기본값이 false기 때문에 true로 변경
        for (int i = 0; i<nums.length; i++) {
            nums[i] = i+2; //nums에 채우기
        }

        //2의배수 지우기
        //checks[4]부터 지우면됨

        //if(N==2) return 1; 테스트케이스중 N==2인 경우 예외처리
        for (int j = 0; j*j <= N; j++) {
            int multipleOf = nums[j];
            //j=2일때 초항이 2이고 공차가 2인 등차수열이므로 i = nums[j]+j;
            for(int i= nums[j]+j;i<nums.length;i+=multipleOf){
                checks[i] = false;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(checks[i])
                System.out.printf("%d ",nums[i]);
        }

    }
}
