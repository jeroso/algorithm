package practice.inflearn.문자열;

import java.util.Scanner;

public class 대소문자변환_02 {

    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        for (char i : charArray) {
            if(Character.isLowerCase(i)) answer += Character.toUpperCase(i);
            if(Character.isUpperCase(i)) answer += Character.toLowerCase(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        대소문자변환_02 main = new 대소문자변환_02();
        Scanner sc = new Scanner(System.in);

        String next = sc.next();
        String solution = main.solution(next);
        System.out.println(solution);

    }
}
