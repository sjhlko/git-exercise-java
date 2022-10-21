package algoStudy.week2;


import java.util.Stack;

public class Programmers12909 {

    public boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push(1);
            else{
                if(stack.empty())
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.empty();
    }
    public boolean solution2(String s){
        while(s.indexOf("()")!=-1){
            s= s.replaceAll("()","");
        }
        return s.length() == 0;
    }
}
