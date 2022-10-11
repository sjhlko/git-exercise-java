package codeUp.day5;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        float d = (a.floatValue()+b.floatValue()+c.floatValue())/3;
        System.out.println(a.add(b).add(c));
        System.out.printf("%.1f",d);
    }
}
