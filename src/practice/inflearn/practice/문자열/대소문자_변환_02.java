package practice.inflearn.practice.문자열;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class 대소문자_변환_02 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) c = Character.toUpperCase(c);
            else if(Character.isUpperCase(c)) c = Character.toLowerCase(c);
            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        대소문자_변환_02 main = new 대소문자_변환_02();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String solution = main.solution(s);
        System.out.println(solution);
    }
}
