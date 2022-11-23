package algorithmInClass.recursive;

import java.util.Scanner;

public class CodeUp1912 {
    public int factorial(int n){
        if (n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        CodeUp1912 c = new CodeUp1912();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.factorial(sc.nextInt()));
    }
}
