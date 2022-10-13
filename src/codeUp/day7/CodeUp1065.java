package codeUp.day7;

import java.util.Scanner;

public class CodeUp1065 {
    public static void checkEven(int x){
        if(x%2==0)
            System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            int x=sc.nextInt();
            checkEven(x);
        }
    }
}
