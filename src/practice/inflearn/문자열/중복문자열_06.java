package practice.inflearn.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 중복문자열_06 {

    public String solution(String str) {
        String answer = "";
        /**
         * 내가 푼 경우
        List<Character> check = new ArrayList<>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if(!check.contains(ch)) {
                check.add(ch);
                answer += ch;
            }
        }
        */
        for (int i = 0; i < str.length(); i++) {
            // 문자의 처음나온 index 번호와 현재 index 번호가 같을 경우만 answer 에 추가하는 방법
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        중복문자열_06 main = new 중복문자열_06();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String solution = main.solution(next);
        System.out.println(solution);
    }
}
