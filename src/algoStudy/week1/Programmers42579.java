package algoStudy.week1;

import sun.net.www.content.text.Generic;

import java.security.KeyStore;
import java.util.*;

public class Programmers42579 {
    public static int[] find2nd(HashMap<Generic,Integer> hm){
        int fir=-1,sec=-1;
        for (Object o : hm.keySet()) {
            if(fir ==-1)
                fir= hm.get(o);
            if(sec==-1)
                sec=hm.get(o);

            if(hm.get(o)>fir){
                fir=hm.get(o);
            } else if(hm.get(o)<=fir&&hm.get(o)>sec){
                sec=hm.get(o);
            }

        }
        int[]ret ={fir,sec};
        return ret;
    }
    //베스트 앨범 https://school.programmers.co.kr/learn/courses/30/lessons/42579
    public int[] solution(String[] genres, int[] plays) {
        HashMap<Integer,String> findGenreByMusicId = new HashMap<>();
        HashMap<Integer,Integer> findPlayByMusicId = new HashMap<>();
        HashMap<String,Integer> cntPlayByGenre = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            findGenreByMusicId.put(i,genres[i]);
            findPlayByMusicId.put(i,plays[i]);
            if(cntPlayByGenre.get(genres[i])==null){
                cntPlayByGenre.put(genres[i],plays[i]);
                continue;
            }
            cntPlayByGenre.put(genres[i],cntPlayByGenre.get(genres[i])+plays[i]);
        }
        List<Map.Entry<String,Integer>> sortedCntGenre = new ArrayList<Map.Entry<String,Integer>>(cntPlayByGenre.entrySet());
        Collections.sort(sortedCntGenre, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int count =1;
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedCntGenre) {
            //find2nd()
            //if(stringIntegerEntry.getKey()
        }
        int[] answer = new int[4];
        return answer;
    }

}
