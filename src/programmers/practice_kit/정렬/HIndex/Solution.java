package programmers.practice_kit.정렬.HIndex;

import java.util.Arrays;

public class Solution {
    public int soulution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        // 0 1 3 5 6
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - 1;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] inx = {3, 0, 6, 1, 5};
        System.out.println(sol.soulution(inx));
    }
}
