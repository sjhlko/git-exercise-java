package algorithmInClass.harshard;

import java.util.PriorityQueue;

public class Programmers12910 {
    //나누어 떨어지는 숫자 배열
    //https://school.programmers.co.kr/learn/courses/30/lessons/12910

    class Solution {
        public int[] solution(int[] arr, int divisor) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%divisor==0)
                    pq.offer(arr[i]);
            }
            if(pq.isEmpty())
                pq.offer(-1);
            int[] ans = new int[pq.size()];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = pq.poll();
            }
            return ans;
        }
    }
}
