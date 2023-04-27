package Inflearn.Section05.올바른괄호;

import BOJ_basic.FastReader;

import java.util.Stack;

public class Main {
    public String Solution(String s) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        if(stack.isEmpty()) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        String s = scan.next();
        Main main = new Main();
        String solution = main.Solution(s);
        System.out.println(solution);
    }
}
