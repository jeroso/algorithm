package practice.programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://school.programmers.co.kr/learn/courses/30/lessons/389479
public class 서버증설횟수 {
    //todo : 다시 해보기
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        int size = 0;  // 현재 서버의 개수
        for(int i = 0; i < 24; i++){
            // 만료된 서버 내리기
            while(!pq.isEmpty() && pq.peek()[0] == i){
                size -= pq.poll()[1];
            }
            int need = players[i] / m;  // 현재 필요한 서버의 개수
            int more = size - need;     // - 서버 증설 개수
            if(more < 0){
                more = -more;
                size  += more;
                answer += more;
                pq.add(new int []{i + k, more});
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        서버증설횟수 main = new 서버증설횟수();
        main.solution(new int[]{0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5}, 3, 5);
    }
}
