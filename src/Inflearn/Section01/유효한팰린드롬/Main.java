package Inflearn.Section01.유효한팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public String Solution(String str) {
        String answer = "YES";
        char[] chars = str.toLowerCase().trim().toCharArray();
        String temp = "";
        for (char aChar : chars) {
            if(aChar >= 97 && aChar <=122) temp += aChar;
        }
        char[] charArray = temp.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if(charArray[i] != charArray[(charArray.length-1) -i]) return "NO";
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
