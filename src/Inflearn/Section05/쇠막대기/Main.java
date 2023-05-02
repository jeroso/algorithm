package Inflearn.Section05.쇠막대기;

import BOJ_basic.FastReader;

import java.util.Stack;

public class Main {
    public int Solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if(str.charAt(i - 1) == ')'){
                    answer += stack.size();
                }else{
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();

        String str = scan.next();
        Main main = new Main();
        main.Solution(str);

    }
}
