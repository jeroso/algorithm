package practice.inflearn.stackAndQueue;


import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거_02 {

    public String solution(String str) {
        String answer = "";
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for (char ch: str.toCharArray()) {
            if (ch == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(ch);
            }

        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        괄호문자제거_02 main = new 괄호문자제거_02();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String solution = main.solution(next);
        System.out.println(solution);
    }
}
