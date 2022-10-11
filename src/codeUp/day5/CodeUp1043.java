package codeUp.day5;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.remainder(b);
        System.out.println(c);
    }
}
