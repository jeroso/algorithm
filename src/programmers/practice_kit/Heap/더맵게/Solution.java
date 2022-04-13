package programmers.practice_kit.Heap.더맵게;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int scov:
             scoville) {
            queue.offer(scov);
        }
        while (queue.peek() <= K) {
            if (queue.size() == 1) {
                return  -1;
            }
            int a = queue.poll();
            int b = queue.poll();
            int res = a + (b * 2);
            queue.offer(res);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(sol.solution(scoville, K));
    }
}
