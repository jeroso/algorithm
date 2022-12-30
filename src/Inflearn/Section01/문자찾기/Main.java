package Inflearn.Section01.문자찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public int Solution(String str, char t) {
        int answer = 0;

        String s = str.toLowerCase();
        char c = Character.toLowerCase(t);
        for (char c1 : s.toCharArray()) {
            if(c1 == c) answer++;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String t = br.readLine();
        int solution = main.Solution(str, t.charAt(0));
        System.out.println("solution = " + solution);

    }
}
