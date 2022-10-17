package codeUp.msExerciseInClass;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        int max=-1;
        int indexX=-1;
        int indexY=-1;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                int now= sc.nextInt();
                if(max<now||(i==1&&j==1)){
                    max= now;
                    indexX=i;
                    indexY=j;
                }
            }

        }
        System.out.println(max);
        System.out.println(indexX+" "+indexY);
    }
}
