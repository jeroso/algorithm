package programmers.practice_kit.stackAndQueue.프린터;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] priorities, int location) {

        List<Integer> list = new ArrayList<>();
        for (int arr :
                priorities) {
            list.add(arr);
        }
        int cnt = 0;
        while (!list.isEmpty()) {
            int print = list.remove(0);
            if (list.stream().anyMatch(o -> print < o)) {
                list.add(print);
            }else{
                cnt++;
                if (location == 0)
                    break;
            }
            location--;
            if(location < 0)
                location = list.size() -1;
        }
        return cnt;
    }
//TODO: class 구현하여 작성

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 0;
        System.out.println(sol.solution(priorities, location));
    }
}
