package month10.week2.set;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNuberGenerator randomNuberGenerator = new RandomNuberGenerator();
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0;i<50;i++){
            int r= randomNuberGenerator.generate(10);
            numbers.add(r);

        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
