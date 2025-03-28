package practice.inflearn.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기_06 {

    public int solution(int n, int cnt) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        int c = 1;
        while (queue.size() > 1) {
            if (c % cnt == 0) {
                queue.poll();
                c = 1;
            } else {
                queue.add(queue.poll());
                c++;
            }
        }
        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        공주구하기_06 main = new 공주구하기_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = sc.nextInt();
        int solution = main.solution(n, cnt);
        System.out.println(solution);
    }
}
