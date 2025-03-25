package practice.inflearn.문자열;

import java.util.Scanner;

public class 특수문자열뒤집기_05 {

    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
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
        특수문자열뒤집기_05 main = new 특수문자열뒤집기_05();

        Scanner sc = new Scanner(System.in);
        String next = sc.next();

        String solution = main.solution(next);
        System.out.println(solution);
    }

}
