package practice.inflearn.문자열;

import java.util.Scanner;

public class 회문문자열_07 {
    // gooG -> Goog 뒤집어도 같은 문자열이면 YES
    public String solution(String str) {
        String answer = "YES";
        /**
         * 내가 푼 로직
        char[] charArray = str.toLowerCase().toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if(charArray[lt] != charArray[rt]) answer = "NO";
            lt++;
            rt--;
        }
        */
        int len = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < len / 2; i++) {
            if(str.charAt(i) != str.charAt(len -1 - i)) answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        회문문자열_07 main = new 회문문자열_07();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();

        String solution = main.solution(next);
        System.out.println(solution);
    }
}
