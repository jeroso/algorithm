package practice.inflearn.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호_01 {
    public String solution(String text){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            if(ch == '(') stack.push(ch);
            else {
                if(stack.empty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.empty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        올바른괄호_01 main = new 올바른괄호_01();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String solution = main.solution(next);
        System.out.println(solution);
    }
}
