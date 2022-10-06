package month10.week2.set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNuberGenerator randomNuberGenerator = new RandomNuberGenerator();
        for(int i=0;i<50;i++){
           int r= randomNuberGenerator.generate(10);
            System.out.println(r);
        }
    }
}
