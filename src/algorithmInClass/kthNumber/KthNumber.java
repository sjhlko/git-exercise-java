package algorithmInClass.kthNumber;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
//k번째 수

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i< commands.length;i++){
            int[] arri = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arri);
            answer[i]=arri[commands[i][2]-1];
        }


        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i< commands.length;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++) {
                pq.offer(array[j]);
            }
            int result =-1;
            for(int j=0;j< commands[i][2];j++){
                result = pq.poll();
            }
            answer[i]=result;
        }


        return answer;
    }
}
