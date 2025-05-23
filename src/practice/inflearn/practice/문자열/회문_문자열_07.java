package practice.inflearn.practice.문자열;

import java.util.Scanner;

public class 회문_문자열_07 {

    public String solution(String s) {
        String answer = "YES";
        String str = s.toLowerCase();
        char[] charArray = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if(charArray[lt] != charArray[rt]) answer = "NO";
            lt++;
            rt--;
        }
        return answer;
    }
    public static void main(String[] args) {
        회문_문자열_07 main = new 회문_문자열_07();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String solution = main.solution(str);
        System.out.println(solution);
    }
}
