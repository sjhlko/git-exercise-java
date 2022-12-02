//https://codeup.kr/problem.php?id=4037&rid=0
//소인수 분해

package algorithmInClass.primeFactor;

import java.util.Scanner;

public class CodeUp4037 {
    public static void findPrimeFactor(int number){
        int primeNumber = 2;
        while (number!=1){
            if(number%primeNumber==0){
                number/=primeNumber;
                System.out.printf("%d ",primeNumber);
                continue;
            }
            primeNumber++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findPrimeFactor(sc.nextInt());
    }
}
