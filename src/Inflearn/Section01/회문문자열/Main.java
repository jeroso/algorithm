package Inflearn.Section01.회문문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String Solution(String str) {
        String answer = "YES";
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[(chars.length- 1) - i]) return "NO";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Main main = new Main();
        String solution = main.Solution(s);
        System.out.println(solution);
    }
}
