package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main_로또의최고순위와최저순위 {
    static int[] lottos;
    static int[] win_nums;
    static int cnt = 0;
    static int zeroCnt = 0;
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 0. lottos 0의 개수
        zeroCnt = Arrays.stream(lottos).filter(n -> n == 0).toArray().length;
        // 1. lottos, win_nums 의 0을 제외한 같은값 몇개인지
        int[] match = Arrays.stream(lottos)
                .filter(n -> Arrays.stream(win_nums).anyMatch(value -> value == n)).toArray();

        // 2. 같은값 개수 : 최소값 / 같은값 개수 + 0의 개수 : 최대값
        //1 : 6개번호 , 2: 5개번호, 3: 4개번호, 4: 3개번호, 5: 2개번호, 6: 이외
        answer[0] = orderingNum(match.length + zeroCnt);
        answer[1] = orderingNum(match.length);
        return answer;
    }

    public static int orderingNum(int n) {
        int ans;
        switch (n) {
            case 6 : ans = 1;
                    break;
            case 5 : ans = 2;
                break;
            case 4 : ans = 3;
                break;
            case 3 : ans = 4;
                break;
            case 2 : ans = 5;
                break;
            default: ans = 6;
        }
        return ans;
    }

    public static void main(String[] args) {
        lottos = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[]{38, 19, 20, 40, 15, 25};
        int[] solution = solution(lottos, win_nums);
        System.out.println(Arrays.toString(solution));
    }
}
