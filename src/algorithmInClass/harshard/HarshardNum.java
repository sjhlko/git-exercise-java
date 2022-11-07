package algorithmInClass.harshard;

public class HarshardNum {
    private int N = 687;
    public int sumDigit(int N){
        int ans = 0;
        while(N!=0){
            ans += N%10;
            N/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        HarshardNum hn = new HarshardNum();
        System.out.println(hn.sumDigit(hn.N));
    }

}
