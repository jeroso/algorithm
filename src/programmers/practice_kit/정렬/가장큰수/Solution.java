package programmers.practice_kit.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solition(int[] numbers) {
        StringBuilder sb = new StringBuilder();
//        sb.append(Integer.toString(numbers[0])).append(Integer.toString(numbers[1])).append(Integer.toString(numbers[2]));
//        int[] arr = new int[numbers.length]
//        for (int i = 0; i < numbers.length; i++) {
//            if(Integer.toString(numbers[i]).length())
//        }
        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        System.out.println(Arrays.toString(str));
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        System.out.println(Arrays.toString(str));
        String answer = "";
        if (str[0].equals("0")) return "0";

        for(String s :str)  answer += s;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {6, 10, 2};
        System.out.println(sol.solition(arr));
    }
}
