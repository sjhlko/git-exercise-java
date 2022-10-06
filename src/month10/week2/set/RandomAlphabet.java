package month10.week2.set;

import java.util.HashSet;

public class RandomAlphabet {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        HashSet<Character> alphabets = new HashSet<>();
        for(int i=0;i<50;i++){
            char r= alphabetGenerator.generate();
            alphabets.add(r);

        }
        System.out.println(alphabets);
        System.out.println(alphabets.size());
    }
}
