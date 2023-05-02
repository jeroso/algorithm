package Inflearn.Section05.교육과정설계;

import BOJ_basic.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public String Solution(String str1, String str2) {
        String answer = "NO";
        Queue<Character> q = new LinkedList<>();
        for (char c : str1.toCharArray()) {
            q.offer(c);
        }
        for (char c : str2.toCharArray()) {
            if(!q.isEmpty() && c == q.peek())
                q.poll();
        }
        if(q.isEmpty()) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        FastReader scan = new FastReader();
        String str1 = scan.next();
        String str2 = scan.next();

        String solution = main.Solution(str1, str2);
        System.out.println(solution);
    }
}
