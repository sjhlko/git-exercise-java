package codeUp.msExerciseInClass;

import java.util.Scanner;

public class CodeUp1620 {
    public static int sumDigit(int x){
        int ans = 0;
        while (x != 0) {
            ans+=x%10;
            x /= 10;
        }
        if(ans<10){
            return ans;
        }
        return sumDigit(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sumDigit(x));
    }
}
