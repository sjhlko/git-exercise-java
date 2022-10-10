package codeUp.day4;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = BigInteger.valueOf(sc.nextInt());
        BigInteger y = BigInteger.valueOf(sc.nextInt());
        BigInteger z = x.add(y);
        System.out.println(z);
    }
}
