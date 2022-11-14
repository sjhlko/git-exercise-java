package algorithmInClass.primeNumber;

public class Eratostenes2 {
    public static void main(String[] args) {
        int N = 50;
        int[] pn = new int[N+1];


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
