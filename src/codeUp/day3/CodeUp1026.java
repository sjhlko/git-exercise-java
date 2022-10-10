package codeUp.day3;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        String[] split = ans.split(":");
        System.out.println(Integer.parseInt(split[1]));

    }
}
