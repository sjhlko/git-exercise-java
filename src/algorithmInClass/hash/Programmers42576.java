package algorithmInClass.hash;

import java.util.HashMap;
import java.util.Map;

//완주하지 못한 선수 풀이
//https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Programmers42576 {
    class SolutionByKKR {

        //이렇게 될 시에 이름 중복이 해결이 안됨
        public String solution1(String[] participant, String[] completion) {
            Map<String, Integer> memo = new HashMap<>();
            for (int i = 0; i < participant.length; i++) {
                String key = participant[i];
                memo.put(key, 1);
            }
            for (int i = 0; i < completion.length; i++) {
                String key = completion[i]; // value 1
                memo.put(key, 0);
            }
            for (String key : memo.keySet()) {
                if (memo.get(key) == 1) {
                    return key;
                }
            }
            return null;
        }
    }
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
