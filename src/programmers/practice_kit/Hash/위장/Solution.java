package programmers.practice_kit.Hash.위장;

import java.util.HashMap;

public class Solution {

    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe:
             clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        int answer = 0;
        return answer;
    }
    public static void main(String[] args) {
        String[][] arr = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution sol = new Solution();
        sol.solution(arr);
    }
}
