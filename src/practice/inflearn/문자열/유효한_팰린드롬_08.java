package practice.inflearn.문자열;

import java.util.Scanner;

public class 유효한_팰린드롬_08 {

    public String solution(String str) {
        //found7, time: study; Yduts; emit, 7Dnuod
        String answer = "NO";
        /**
         * 내가 푼 방법
        String answer = "YES";
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toLowerCase().replace(" ", "").toCharArray();
        for (char ch : charArray) {
            if(Character.isAlphabetic(ch)) sb.append(ch);
        }
        String result = sb.toString();
        int lt = 0, rt = result.length() - 1;
        while (lt < rt) {
            if(result.charAt(lt) != result.charAt(rt)) return "NO";
            lt++;
            rt--;
        }
        */
        // 대문자알파벳 이외의 모든값 제외 후 이걸 뒤집은 값과 같은지 아닌지 판단
        String replaced = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(replaced).reverse().toString();
        if(replaced.equals(reverse)) return "YES";
        return answer;
    }

    public static void main(String[] args) {
        유효한_팰린드롬_08 main = new 유효한_팰린드롬_08();
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String solution = main.solution(next);
        System.out.println(solution);
    }
}
