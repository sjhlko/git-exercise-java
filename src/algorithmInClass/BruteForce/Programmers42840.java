package algorithmInClass.BruteForce;

public class Programmers42840 {
    public int solution(int[] answers) {
        int firstStudentAnswerCnt = 0;
        int[] firstPattern = {1,2,3,4,5};
        int pointer = 0;
        while (pointer<answers.length){
            if(firstPattern[pointer%4]==answers[pointer])
                firstStudentAnswerCnt++;
            pointer++;

        }
        System.out.println(firstStudentAnswerCnt);
        return firstStudentAnswerCnt;
    }

    public static void main(String[] args) {

    }
}
