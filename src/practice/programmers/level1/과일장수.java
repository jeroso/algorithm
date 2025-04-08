package practice.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class 과일장수 {
    //내가 푼 방식
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int[] array = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < array.length; i++) {
            min = Math.min(array[i], min);
            if ((i + 1) % m == 0) {
                answer += min * m;
                min = Integer.MAX_VALUE;
            }
        }

        return answer;
    }
    //다른사람이 푼 방식 sort 후 역순으로 for문
    // m = 4 일때 4개씩 짤라서 마지막값이 최소값이 정해지므로 그값으로 계산
    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        과일장수 main = new 과일장수();
        int case1 = main.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        int case2 = main.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(case1);
        System.out.println(case2);
    }
}
