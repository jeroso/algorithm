package Inflearn.Section05.공주구하기;

import BOJ_basic.FastReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public int Solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            q.poll();
            if(q.size() == 1) answer = q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int k = scan.nextInt();
        Main main = new Main();
        int solution = main.Solution(n, k);
        System.out.println(solution);
    }
}
