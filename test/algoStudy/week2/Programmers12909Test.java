package algoStudy.week2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers12909Test {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void solution() {
        Programmers12909 sb = new Programmers12909();
        assertTrue(sb.solution("()()"));
    }

    @Test
    @DisplayName("강사님 풀이(괄호를 하나씩 삭제)")
    void solution2() {
        Programmers12909 sb = new Programmers12909();
        assertTrue(sb.solution2("()()"));
    }

    @Test
    @DisplayName("강사님 풀이(splitted 이용)")
    void solution3() {
        Programmers12909 sb = new Programmers12909();
        assertTrue(sb.solution3("()()"));
    }

    @Test
    @DisplayName("중괄호 대괄호")
    void solution4() {
        Programmers12909 sb = new Programmers12909();
        assertTrue(sb.solutionForAllBrackets("({}[])"));
    }
}