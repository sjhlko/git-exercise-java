package algorithmInClass.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers42840 {
    public int[] solution(int[] answers) {

        //강사님 풀이
        //        String answerPattern1 = "12345".repeat(4000);
        //        String answerPattern2 = "21232425".repeat(1250);
        //        String answerPattern3 = "3311224455".repeat(1000);
        //
        //// 공간복잡도로 속도를 높이는 방법
        //
        //        int firstStudentAnswerCnt = 0;
        //// 12345 패턴으로 찍는 학생이 몇 문제를 맞추었는지 알아내는 코드
        //        for (int i = 0; i < answer.length; i++) {
        //            if(Character.getNumericValue(answerPattern1.charAt(i)) == answer[i]) firstStudentAnswerCnt++;
        //        }
        //
        //        System.out.println(firstStudentAnswerCnt);

        int[] answer = new int[3];
        int[] firstPattern = {1,2,3,4,5};
        int[] secondPattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int pointer = 0;
        while (pointer<answers.length){
            if(firstPattern[pointer%5]==answers[pointer])
                answer[0]++;
            if(secondPattern[pointer%8]==answers[pointer])
                answer[1]++;
            if(thirdPattern[pointer%10]==answers[pointer])
                answer[2]++;
            pointer++;
        }
        int max = -1;
        for(int i=0;i<answer.length;i++){
            if(max<=answer[i])
                max=answer[i];
        }
        List<Integer> ansList = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(max==answer[i]){
                ansList.add(i+1);
            }
        }
        int[] ansPrint = new int[ansList.size()];
        for (int i = 0 ; i < ansList.size() ; i++) {
            ansPrint[i] = ansList.get(i);
        }
        return ansPrint;
    }

}
