package programmers.practice_kit.정렬.N번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
    //1. i, j, k : i~j번째 까지 숫자를 자르고 정렬 했을때 k번째 수 리턴
        int[] answer = new int[100];
        List<Integer> list = new ArrayList<>();

        for (int arr :
                array) {
            list.add(arr);
        }
        for (int i = 0; i < commands.length; i++) {
           int[] temp = Arrays.stream(Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1])).sorted().toArray();
           answer[i] = temp[commands[i][2]-1];
        }
        //TODO: 다른사람 풀이 및 stream sout 방법 익히기

        //[5, 6, 3]
        return Arrays.stream(answer).filter(o -> o != 0).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution.solution(arr, com));
    }
}
