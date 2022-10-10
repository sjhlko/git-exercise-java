package codeUp.day3;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        for (int x=0;x<ans.length();x++) {
            System.out.println("\'"+ans.charAt(x)+"\'");
        }
    }
}
