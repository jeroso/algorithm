package practice.inflearn.practice.문자열;

import java.util.Scanner;

public class 특수문자열_뒤집기_05 {

    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int lt = 0, rt = charArray.length - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(charArray[rt])) {
                rt --;
            } else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArray);
        return answer;
    }
    public static void main(String[] args) {
        특수문자열_뒤집기_05 main = new 특수문자열_뒤집기_05();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String solution = main.solution(s);
        System.out.println(solution);
    }

}
