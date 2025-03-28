package practice.inflearn.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계_07 {

    public String solution(String input1, String input2) {
        String answer = "NO";
        Queue<Character> queue = new ArrayDeque<>();
        for (char ch : input1.toCharArray()) {
            queue.add(ch);
        }
        for (char ch : input2.toCharArray()) {
            if(queue.isEmpty()) return "YES";
            if(queue.peek() == ch) queue.poll();
        }

        return answer;
    }
    public static void main(String[] args) {
        교육과정설계_07 main = new 교육과정설계_07();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        String solution = main.solution(input1, input2);
        System.out.println(solution);
    }
}
