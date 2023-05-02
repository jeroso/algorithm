package Inflearn.Section05.후위식연산;

import BOJ_basic.FastReader;
import jdk.dynalink.beans.StaticClass;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public int Solution(String text) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48); //입력된 정수값으로 stack push
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt + rt);
                else if (c == '-') stack.push(lt - rt);
                else if (c == '*') stack.push(lt * rt);
                else if (c == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();

        String next = scan.next();
        Main main = new Main();
        int solution = main.Solution(next);
        System.out.println(solution);
    }
}
