package codeUp.day2;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        //System.out.println(x);
        //String[] ans = x.split("."); 이렇게 사용하면 절대 안됨..............
        //split() 메소드는 파라미터로 정규식을 입력 받는데,
       //정규식에서 마침표(.)는 임의의 한 문자를 의미합니다.
    //따라서, 문자열을 마침표(.)로 구분하고 싶다면 아래와 같은 방법을 사용해야 합니다.
    String[] ans = x.split("[.]");
        System.out.printf("%04d.%02d.%02d",Integer.valueOf(ans[0]),Integer.valueOf(ans[1]),Integer.valueOf(ans[2]));
    }

}
