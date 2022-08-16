package programmers.level1;

import java.util.StringTokenizer;

public class Main_숫자문자열과영단어 {
    static String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static int Solution(String s) {
        for (int i = 0; i < 10; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
    public static void main(String[] args) {
        String s = "one4seveneight";
        int solution = Solution(s);
        System.out.println(solution);

    }

}
