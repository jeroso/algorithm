package practice.programmers.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class 문자열_나누기 {
    //내가 푼 방법
    public int solution(String s) {
        int answer = 1;
        char ch = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (cnt == 0) {
                answer++;
                ch = s.charAt(i);
            }
            if (s.charAt(i) == ch) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return answer;
    }
    // 다른사람이 푼 방법
    public int solution2(String s) {
        char prev = '1';
        int same = 0, different = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (prev == '1') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                prev = '1';
                same = 0; different = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        문자열_나누기 main = new 문자열_나누기();
        String s = "banana";
//        String s = "aaabbaccccabba";
        int solution = main.solution(s);
        System.out.println(solution);
    }
}
