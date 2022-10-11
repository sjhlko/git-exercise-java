package codeUp.msExerciseInClass;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        while (x != 0) {
            x /= 10;
            ans++;
        }
        System.out.println(ans);
    }
}
