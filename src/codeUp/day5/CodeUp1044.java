package codeUp.day5;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
