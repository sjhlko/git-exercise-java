package algorithmInClass.hash;

import java.util.HashMap;

//완주하지 못한 선수 풀이
//https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Programmers42576 {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer="";
            HashMap<String, Integer> ph = new HashMap<>();
            for (String s : participant) {
                if(ph.get(s)!=null){
                    ph.put(s,ph.get(s)+1);
                }
                else{
                    ph.put(s,0);
                }
            }
            for (String s : completion) {
                ph.put(s,ph.get(s)-1);
            }
            for (String s : participant) {
                if(ph.get(s)>=0){
                    answer= s;
                }
            }
            return answer;
        }
    }
}
