package Inflearn.Section01.대소문자변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String Solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.println("c = " + c);
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(main.Solution(s));
    }
}
