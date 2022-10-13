package codeUp.day7;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        if(x>=90)
            System.out.println("A");
        else if(x>=70)
            System.out.println("B");
        else if(x>=40)
            System.out.println("C");
        else
            System.out.println("D");
    }
}
