package codeUp.day3;
import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        String[] split = ans.split("[.]");
        System.out.println(split[0]);
        System.out.println(split[1]);

    }
}