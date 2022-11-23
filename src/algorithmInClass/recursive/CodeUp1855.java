package algorithmInClass.recursive;

import java.util.Scanner;

public class CodeUp1855 {
    public int Fibonacci(int n){
        if (n==1||n==2)
            return 1;
        return Fibonacci(n-2)+Fibonacci(n-1);
    }
    public static void main(String[] args) {
        CodeUp1855 c = new CodeUp1855();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.Fibonacci(sc.nextInt()));
    }
}
