package practice.inflearn.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 암호_12 {

    public String solution(int cnt, String str) {
        String answer = "";
        List<String> list = new ArrayList<>();
        int len = str.length() / cnt;
        for (int i = 0; i < str.length(); i += len) {
            list.add(str.substring(i, i + len));
        }
        for (String s : list) {
            String replace = s.replace("#", "1").replace("*", "0");
            answer += (char) Integer.parseInt(replace, 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        암호_12 main = new 암호_12();

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String next = sc.next();
        String solution = main.solution(i, next);
        System.out.println(solution);
    }
}
