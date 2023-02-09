package Inflearn.Section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String Solution() {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int i = Integer.parseInt(br.readLine());

        String solution = main.Solution();
        System.out.println(solution);
    }
}
