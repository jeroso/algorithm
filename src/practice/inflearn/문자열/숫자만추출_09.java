package practice.inflearn.문자열;

import java.util.Scanner;

public class 숫자만추출_09 {

    public int solution(String str) {
        //g0en2T0s8eSoft
        /**
         * 내가 푼 방법
        int answer = 0;
        String replaced = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(replaced);
        */
        String answer = "";
        for (char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) answer += ch;
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        숫자만추출_09 main = new 숫자만추출_09();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int solution = main.solution(next);
        System.out.println(solution);
    }
}
