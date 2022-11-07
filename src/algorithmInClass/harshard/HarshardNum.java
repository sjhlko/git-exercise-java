package algorithmInClass.harshard;

public class HarshardNum {
    //하샤드 수
    //https://school.programmers.co.kr/learn/courses/30/lessons/12947
    private int N;

    public HarshardNum(int n) {
        N = n;
    }

    public int sumDigit(int N){
        int ans = 0;
        while(N!=0){
            ans += N%10;
            N/=10;
        }
        return ans;
    }

    public boolean isHarshard(int sum){
        if(this.N%sum==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        HarshardNum hn = new HarshardNum(10);
        System.out.println(hn.isHarshard(hn.sumDigit(hn.N)));
    }

}
