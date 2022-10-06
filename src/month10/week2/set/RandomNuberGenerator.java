package month10.week2.set;

public class RandomNuberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
        //num 미만의 숫자를 리턴
    }
}
