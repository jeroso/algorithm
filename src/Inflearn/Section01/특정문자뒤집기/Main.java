package Inflearn.Section01.특정문자뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //a#b!GE*T@S => S#T!EG*b@a
    public String Solution(String str) {
        String answer = "";
        if (str.matches("^[a-zA-Z]*$")) {
            System.out.println("영문");
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String solution = main.Solution(s);
        System.out.println(solution);
    }
}
