package programmers.practice_kit.stackAndQueue.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> soultion(int[] progresses, int[] speeds) {
        //  song solution
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] > 0) {
                days[i] = ((100 - progresses[i]) / speeds[i]) + 1;
            } else {
                days[i] = (100 - progresses[i]) / speeds[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        list.add(1);
        int pivot = days[0];
        for (int i = 1; i < days.length; i++) {
            if (days[i] > pivot) {
                cnt++;
                list.add(1);
                pivot = days[i];
            } else {
                list.set(cnt, list.get(cnt) + 1);
            }
        }
        return list;
    }

    /**
     * 람다식 풀이
     * @param progresses
     * @param speeds
     * @return
     */
    static int[] result(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
//        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speed = {1, 30, 5};
//        int[] speed = {1, 1, 1, 1, 1, 1};
        Solution sol = new Solution();
        System.out.println(sol.soultion(progresses, speed));
    }
}
