package algorithmInClass.recursive;

import java.util.Scanner;

public class CodeUp1851 {
    public void printStar(int n, int count){
        if (count==n)
            return;
        System.out.print("*");
        printStar(n,count+1);
    }
    public static void main(String[] args) {
        CodeUp1851 c = new CodeUp1851();
        Scanner sc = new Scanner(System.in);
        c.printStar(sc.nextInt(),0);
    }
}
