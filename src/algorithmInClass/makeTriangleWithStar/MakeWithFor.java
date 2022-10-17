package algorithmInClass.makeTriangleWithStar;

import java.util.Scanner;

public class MakeWithFor {
    private  String letter = "*";
    public MakeWithFor() {
    }
    public MakeWithFor(String letter) {
        this.letter = letter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        MakeWithFor makeWithFor = new MakeWithFor("@");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(makeWithFor.letter+" ");
            }
            System.out.println("");
        }
    }
}
