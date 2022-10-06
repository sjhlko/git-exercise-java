package month10.week2.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("김경록");
        set1.add("김경록"); //중복으로 들어가지 않음

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(2);

        System.out.println(setInteger);
    }
}
