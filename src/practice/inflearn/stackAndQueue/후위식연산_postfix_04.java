package practice.inflearn.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산_postfix_04 {

    public int solution(String str) {
        int answer;
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) stack.push(Character.digit(ch, 10));
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(ch == '+') stack.push(lt + rt);
                else if(ch == '*') stack.push(lt * rt);
                else if(ch == '/') stack.push(lt / rt);
                else stack.push(lt - rt);
            }
        }
        answer = stack.peek();
        return answer;
    }

    public static void main(String[] args) {
        후위식연산_postfix_04 main = new 후위식연산_postfix_04();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int solution = main.solution(str);
        System.out.println(solution);
    }
}
