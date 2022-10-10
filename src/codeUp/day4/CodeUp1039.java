package codeUp.day4;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        BigInteger z = x.add(y);
        System.out.println(z);
    }
}
