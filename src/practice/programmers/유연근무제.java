package practice.programmers;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/388351
public class 유연근무제 {

    //내가 푼 방법
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        //시간 *10 + 분

        for (int i = 0; i < schedules.length; i++) {
            boolean success = true;
            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;
                if(day == 6 || day == 7) continue;
                if(60 * (schedules[i]/100) + schedules[i] % 100 + 10 <
                        60 *(timelogs[i][j] / 100) + timelogs[i][j]%100) success = false;
            }
            if(success) answer++;
        }

        return answer;
    }
    //다른 사람이 푼 방법
    public int solution2(int[] schedules, int[][] timeLogs, int startDay) {
        return (int) IntStream.range(0, timeLogs.length)
                .filter(i -> IntStream.range(0, timeLogs[i].length).filter(idx -> timeLogs[i][idx] > (schedules[i] + ((schedules[i] % 100 > 49) ? 50 : 10)) && !(idx == 6 - startDay % 7 || idx == 7 - startDay)).count() == 0)
                .count();
    }

    public static void main(String[] args) {
        유연근무제 main = new 유연근무제();
        int[] schedules = {700, 800, 1100};
//        int[] schedules = {730, 855, 700, 720};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
//        int[][] timelogs = {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}};
        int startDay = 5;
//        int startDay = 1;
        int solution = main.solution(schedules, timelogs, startDay);
        System.out.println(solution);
    }
}
