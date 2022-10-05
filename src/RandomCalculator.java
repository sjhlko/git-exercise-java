import java.util.Random;

public class RandomCalculator {
    private int a,ranNum;

    public RandomCalculator(int a) {
        this.a=a;

    }
    public void getRandom(){
        Random random = new Random();
        this.ranNum = random.nextInt()%10;
        System.out.println("랜덤한 숫자 "+ this.ranNum);
    }

    public void plus(){
        getRandom();
        System.out.println("plus"+(a+ranNum));
    }
    public void minus(){
        getRandom();
        System.out.println("minus "+(a-ranNum));
    }
    public void multiple(){
        getRandom();
        System.out.println("multiple "+(a*ranNum));
    }
    public void devide(){
        getRandom();
        if(ranNum==0){
            System.out.println("랜덤하게 선택된 숫자가 0이므로 나누기 연산 불가능");
            return;
        }

        float result = (float)a/(float)ranNum;
        System.out.println("devide "+result);
    }

}
