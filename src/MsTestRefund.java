public class MsTestRefund {
    public static void main(String[] args) {
        int refund=25400;
        int curr50000=50000;
        int curr10000=10000;
        int curr5000=5000;
        int curr1000=1000;
        System.out.printf("5만원권 %d장 나머지:%d\n",refund/curr50000, refund%curr50000);
        refund%=50000;
        System.out.printf("1만원권 %d장 나머지:%d\n",refund/curr10000, refund%curr10000);
        //5000원권은 1장만 나오게 하고 싶다. 왜냐하면 앞에서 만원권으로 처리했기때문
        //refund-=20000;
        refund%=10000;
        System.out.printf("5천원권 %d장 나머지:%d\n", refund/curr5000, refund%curr5000);
        refund%=5000;
        System.out.printf("천원권 %d장 나머지:%d\n", refund/curr1000, refund%curr1000);
        refund%=1000;
        System.out.printf("오백원권 %d개 나머지:%d\n", refund/500, refund%500);
        refund%=500;
        System.out.printf("백원권 %d개 나머지:%d\n", refund/100, refund%100);
        refund%=100;
        System.out.printf("오십원권 %d개 나머지:%d\n", refund/50, refund%50);
        refund%=50;
        System.out.printf("십원권 %d개 나머지:%d\n", refund/10, refund%10);
        refund%=10;
        //같은 단어 여러개 선택 : art+j;
    }
}
