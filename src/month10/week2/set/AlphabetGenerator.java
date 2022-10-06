package month10.week2.set;

public class AlphabetGenerator implements Generator {

    @Override
    public char generate() {
        char c = (char) ( Math.random()*26+65);
        return c;
    }
}
