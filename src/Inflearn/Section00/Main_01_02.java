package Inflearn.Section00;

import java.util.Scanner;


/**
 * 대소문자 변환
 * StuDY
 * sTUdy
 */
public class Main_01_02 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                answer += Character.toLowerCase(str.charAt(i));
            } else {
                answer += Character.toUpperCase(str.charAt(i));
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main_01_02 main = new Main_01_02();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        var solution = main.solution(input1);
        System.out.println("solution = " + solution);

    }
}
