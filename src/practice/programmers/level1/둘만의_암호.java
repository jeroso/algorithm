package practice.programmers.level1;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class 둘만의_암호 {
    // 내가 푼 방식 > 시간 초과 에러
    public String solution(String s, String skip, int index) {
        String answer = "";
        Set<Character> set = new HashSet<>();
        for (char c : skip.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            int cnt = 0;
            char ans = c;
            while (cnt < index) {
                if(!set.contains(ans++)){
                    cnt++;
                }
            }
            answer += (char) ((ans - 97) % 26 + 97);
        }
        return answer;
    }
    // 간단하게 수정
    public String solution2(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int count = 0;
            while (count < index) {
                if (c == 'z') {
                    c = 'a';
                } else {
                    c++;
                }
                if(!skip.contains(String.valueOf(c))) count ++;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        둘만의_암호 main = new 둘만의_암호();
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String solution = main.solution(s, skip, index);
        System.out.println(solution);
    }
}
