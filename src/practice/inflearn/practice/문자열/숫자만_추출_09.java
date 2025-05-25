package practice.inflearn.practice.문자열;

import java.util.Scanner;

public class 숫자만_추출_09 {

    public int solution(String str) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) sb.append(c);
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }
    public static void main(String[] args) {
        숫자만_추출_09 main = new 숫자만_추출_09();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = main.solution(str);
        System.out.println(result);
    }
}
