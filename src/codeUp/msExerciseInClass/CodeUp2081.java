package codeUp.msExerciseInClass;

import java.util.Scanner;

public class CodeUp2081 {
    public static void main(String[] args) {
        int max = 0,index = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<10;i++){
            int now= sc.nextInt();
            if(max<now||(i==1)){
                max= now;
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
