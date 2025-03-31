package practice.programmers;

import java.util.ArrayList;
import java.util.List;

public class 덧칠하기 {

    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = section[0] + m - 1;
        for (int i = 0; i < section.length; i++) {
            if(section[i] >= start && section[i] <= end) continue;
            else {
                start = section[i];
                end = section[i] + (m - 1);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        덧칠하기 main = new 덧칠하기();
//        int n = 8;
//        int n = 5;
        int n = 4;
//        int m = 4;
//        int m = 4;
        int m = 1;
//        int[] section = {2, 3, 6};
//        int[] section = {1, 3};
        int[] section = {1, 2, 3, 4};
        int solution = main.solution(n, m, section);
        System.out.println(solution);
    }
}
