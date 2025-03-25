package Inflearn.Section00;

import java.util.Scanner;

/**
 * it is time to study
 * study
 */
public class Main_01_03 {
    public String solution(String str){
        String answer = "";
        int length = 0;
        String[] s = str.split(" ");
        System.out.println("s[1] = " + s[1]);
        for (int i = 0; i < s.length; i++) {
            System.out.println("i = " + i);
            if(s[i].length() > length) {
                length = s[i].length();
                System.out.println(length);
                answer = s[i];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main_01_03 main = new Main_01_03();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        var solution = main.solution(input1);
        System.out.println(solution);
    }
}
