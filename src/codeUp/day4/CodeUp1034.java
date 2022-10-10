package codeUp.day4;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        int ansOct=Integer.valueOf(ans,8);
        int ansDecimal=Integer.parseInt(Integer.toString(ansOct),10);

        System.out.print(ansDecimal);
    }
}
