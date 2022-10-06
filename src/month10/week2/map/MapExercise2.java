package month10.week2.map;

import java.util.HashMap;

public class MapExercise2 {
    public boolean isAlphabet(char alphabet) {
        if ((alphabet >= 'A' && alphabet < 'Z') || (alphabet > 'a' && alphabet < 'z')) {
            return true;

        } else return false;
    }

    public static void main(String[] args) {
        MapExercise2 mapExercise2 = new MapExercise2();
        HashMap alphabet= new HashMap<Character,Integer>();
        String s = new String("https://github.com/dongyeon-0822/java-project-exercise").toUpperCase();
        /*
        * 강사님 풀이) 미리 A~Z까지 넣어놓는다 0개로
        * for(char c='A';c<='Z';c++){
        *   alphabet.put(c,0);
        * }
        *
        * */
        for(int i=0;i<s.length();i++){
            if((mapExercise2.isAlphabet(s.charAt(i)))){
                int num=1;
                if(alphabet.get(s.charAt(i))!=null){
                    num=(int)alphabet.get(s.charAt(i))+1;
                }
                alphabet.put(s.charAt(i),(Integer)num);

            }
        }
        System.out.println(alphabet);

    }
}
