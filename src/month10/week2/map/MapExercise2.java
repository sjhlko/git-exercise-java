package month10.week2.map;

import java.util.HashMap;

public class MapExercise2 {
    public boolean isAlphabet(char alphabet){
        if((alphabet>='A'&&alphabet<'Z')||(alphabet>'a'&&alphabet<'z')){
            return true;

        }
        else return false;
    }
    public static void main(String[] args) {
        HashMap alphabet= new HashMap<Character,Integer>();
        String s = new String("https://github.com/dongyeon-0822/java-project-exercise");
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&&s.charAt(i)<'Z')||(s.charAt(i)>'a'&&s.charAt(i)<'z')){
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
