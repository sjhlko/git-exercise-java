import java.util.Scanner;

public class MsTest {
    public static void main(String[] args) {
        System.out.print("금액을 넣으세요: ");
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        int next=5, unit=50000;
        while(unit>=10){
            System.out.println(unit+"원"+money/unit+"개");
            money=money-money/unit*unit;
            if(next==5){
                unit/=5;
                next=1;
                continue;
            }
            else if(next==1){
                unit/=2;
                next=5;
            }
        }
    }
}
