package algorithmInClass.primeNumber;

public class TemplateCallbackPrime {
    //조건문의 특정 부분만 바뀌기 때문에 이 패턴을 적용함
    //i<n, i<n/2, i*i<n(sqre는 연산이 많이 이것으로 대체)
    //해당 논리 연산을 하는 부분만 함수로 분리

    boolean someOperation(int a, int b){
        return a<b;
    }

    boolean isPrime(int num){
        for(int i=2; someOperation(i,num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
