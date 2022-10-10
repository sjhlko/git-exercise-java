package codeUp.day3;

import java.util.Scanner;

public class CodeUp1025 {
    public static int makeAns(int x){
        int cnt=1;
        while(x/10!=0){
            x/=10;
            cnt*=10;
        }
        System.out.println("["+x*cnt+"]");
        return x*cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        while(ans!=0){
            ans-=makeAns(ans);
        }
    }
}

