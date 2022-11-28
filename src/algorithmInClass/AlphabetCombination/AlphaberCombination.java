package algorithmInClass.AlphabetCombination;

public class AlphaberCombination {
    public void alphabetRecursive(int count){
        if(count>=26)
            return;
        System.out.println((char)('A'+count));
        alphabetRecursive(count+1);
    }

    public void printAlphabet(){
        for(int j=0;j<26;j++){
            System.out.println((char)('A'+j));
        }
    }
    public void printAlphabet2(){
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                System.out.print((char)('A'+i));
                System.out.println((char)('A'+j));

            }
        }
    }
    public static void main(String[] args) {
        AlphaberCombination ac = new AlphaberCombination();
        ac.alphabetRecursive(0);
    }
}
