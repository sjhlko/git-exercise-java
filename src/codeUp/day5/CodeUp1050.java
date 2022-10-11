package codeUp.day5;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        int c = a.subtract(b).intValue()==0? 1:0;
        System.out.println(c);
    }
}
