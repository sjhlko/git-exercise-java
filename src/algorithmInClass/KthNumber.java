package algorithmInClass;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
//k번째 수

import java.util.Arrays;

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
    public static void main(String[] args) {

    }
}
