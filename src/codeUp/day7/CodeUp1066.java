package codeUp.day7;

import java.util.Scanner;

public class CodeUp1066 {
    public static void checkEvenOrOdd(int x){
        if(x%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            int x=sc.nextInt();
            checkEvenOrOdd(x);
        }
    }

}
