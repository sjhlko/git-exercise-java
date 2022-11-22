package algorithmInClass.recursive;

import java.util.Scanner;

public class CodeUp1854 {
    public int sumNums(String n, int index){
        if (n.length()==index)
            return 0;
        return Character.getNumericValue(n.charAt(index))+sumNums(n,index+1);
    }
    public static void main(String[] args) {
        CodeUp1854 c = new CodeUp1854();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.sumNums(sc.next(),0));
    }
}
