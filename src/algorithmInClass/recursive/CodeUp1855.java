package algorithmInClass.recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp1855 {
    public int fibonacci(int n){
        if (n==1||n==2)
            return 1;
        return fibonacci(n-2)+fibonacci(n-1);
    }

    public int fibonacciArr(int n){
        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;
        for(int i=3;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
        CodeUp1855 c = new CodeUp1855();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.fibonacci(sc.nextInt()));
        System.out.println(c.fibonacciArr(sc.nextInt()));

    }
}
