package practice.inflearn.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기_05 {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]== '(') stack.push(charArray[i]);
            else {
                if (charArray[i - 1] == '(') {
                    stack.pop();
                    answer += stack.size();
                } else{
                    stack.pop();
                    answer += 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        쇠막대기_05 main = new 쇠막대기_05();
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int solution = main.solution(text);
        System.out.println(solution);
    }
}
