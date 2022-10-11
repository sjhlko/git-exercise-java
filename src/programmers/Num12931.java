package programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/12931
//자릿수 더하기 문제
class Num12931 {
    public int solution(int n) {
        int answer = 0;
        int N=n;
        while(true){
            int num=0;
            while(N/10!=0){
                N=N/10;
                num++;
            }
            answer+=N;
            int next = (int) Math.pow(10, num);
            N=n%next;
            if(N<10){
                answer+=N;
                return answer;
            }
        }
    }
}