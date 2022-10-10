package codeUp.day4;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = x.negate();
        System.out.println(y);
    }
}
