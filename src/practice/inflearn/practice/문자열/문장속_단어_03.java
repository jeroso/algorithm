package practice.inflearn.practice.문자열;

import java.util.Scanner;

public class 문장속_단어_03 {

    public String solution(String str) {
        String answer = "";
        String[] s = str.split(" ");
        for(String s1 : s) {
            if(s1.length() > answer.length()) answer = s1;
        }
        return answer;
    }
    public static void main(String[] args) {
        문장속_단어_03 main = new 문장속_단어_03();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String solution = main.solution(s);
        System.out.println(solution);
    }
}
