package practice.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class 명예의전당_01 {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> queue = new PriorityQueue<>();
        int cnt = 0;
        for (int i : score) {
            if (queue.size() != k) {
                queue.add(i);
            } else {
                queue.add(i);
                queue.poll();
            }
            answer[cnt] = queue.peek();
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        명예의전당_01 main = new 명예의전당_01();
//        int k = 3;
        int k = 4;
//        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] solution = main.solution(k, score);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
