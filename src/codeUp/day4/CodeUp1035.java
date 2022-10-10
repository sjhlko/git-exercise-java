package codeUp.day4;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        int ansDecimal=Integer.valueOf(ans,16);
        String ansOct= Integer.toOctalString(ansDecimal);
        System.out.print(ansOct);
    }
}
