package codeUp.day2;

import java.util.Scanner;

public class CodeUp1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] ans = x.split("-");
        System.out.println(ans[0]+ans[1]);
    }
}
