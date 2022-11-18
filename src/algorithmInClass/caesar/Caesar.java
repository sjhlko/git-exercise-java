package algorithmInClass.caesar;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
// 시저암호
public class Caesar {
    public String solution(String s, int n) {
        String answer = "";
        char changed = ' ';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                answer+=" ";
                continue;
            }
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                if(s.charAt(i)+n>'z')
                    changed = (char) (s.charAt(i)+n-26);
                else changed = (char) (s.charAt(i)+n);
            } else {
                if(s.charAt(i)+n>'Z')
                    changed = (char) (s.charAt(i)+n-26);
                else changed = (char) (s.charAt(i)+n);
            }
            answer+=Character.toString(changed);
        }
        return answer;
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        System.out.println(caesar.solution("a B z",4));
    }
}
