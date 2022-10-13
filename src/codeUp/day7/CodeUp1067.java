package codeUp.day7;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        if(x>0)
            System.out.println("plus");
        else
            System.out.println("minus");
        if(x%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
