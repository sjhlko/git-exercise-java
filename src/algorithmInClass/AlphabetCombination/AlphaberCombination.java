package algorithmInClass.AlphabetCombination;

public class AlphaberCombination {
    public static void main(String[] args) {
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                System.out.print((char)('A'+i));
                System.out.println((char)('A'+j));

            }
        }
    }
}
