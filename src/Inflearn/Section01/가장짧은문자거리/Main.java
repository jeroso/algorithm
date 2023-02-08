package Inflearn.Section01.가장짧은문자거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//teachermode e
public class Main {
    public String Solution(String str, String c) {
        String answer = "";
        int lt = 1000, rt = 1000;
        int[] ltArr = new int[str.length()];
        int[] rtArr = new int[str.length()];
        int[] ans = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(c.equals(str.charAt(i))){
                ltArr[i] = 0;
                lt = 0;
            }else{
                ltArr[i] = lt;

            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String c = br.readLine();
        String solution = main.Solution(s, c);
        System.out.println(solution);
    }
}
