package codeUp.msExerciseInClass;


import java.util.Scanner;

public class CodeUp1859 {
    public static String makeStar(int n){
        String star = "*";
        if(n==1){
            System.out.print(star);
            return "";
        }
        System.out.print(makeStar(n-1)+star);
        return "";
    }
    public static String makeAns(int n,int count){
        if(n==count){
            return makeStar(n);
        }
        System.out.println(makeStar(count));
        return makeAns(n,count+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        makeAns(sc.nextInt(),1);
    }
}
