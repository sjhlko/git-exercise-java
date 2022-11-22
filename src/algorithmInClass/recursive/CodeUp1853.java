package algorithmInClass.recursive;

import java.util.Scanner;

public class CodeUp1853 {
    public int sumNums(int n){
        if (n==0)
            return 0;
        return n+sumNums(n-1);
    }
    public static void main(String[] args) {
        CodeUp1853 c = new CodeUp1853();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.sumNums(sc.nextInt()));
    }
}
