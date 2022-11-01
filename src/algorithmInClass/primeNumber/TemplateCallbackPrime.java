package algorithmInClass.primeNumber;

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime{
    //조건문의 특정 부분만 바뀌기 때문에 이 패턴을 적용함
    //i<n, i<n/2, i*i<n(sqre는 연산이 많이 이것으로 대체)
    //해당 논리 연산을 하는 부분만 함수로 분리


    //익명 내부클래스 적용
    boolean isPrime(int num, StatementStrategy stmt){
        for(int i=2; stmt.compare(i,num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime = new TemplateCallbackPrime();
        //람다식 적용
        boolean r1 = templateCallbackPrime.isPrime(17,(a,b)->a<b);
        boolean r2 = templateCallbackPrime.isPrime(17,(a,b)->a*a<b);
        boolean r3 = templateCallbackPrime.isPrime(17,(a,b)->a<b/2);

        //람다식 적용안하면 이렇게됨;;
//        public static void main(String[] args) {
//            TemplateCallbackPrime tcp = new TemplateCallbackPrime();
//            boolean r = tcp.isPrime(17, new StatementStrategy() {
//                @Override
//                public boolean compare(int a, int b) {
//                    return a * a <= b;
//                }
//            });
//            System.out.println(r);
//        }

        System.out.println(r1);
    }


}
