package Inflearn.Section01.아나그램;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public String Solution(String s1, String s2) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s1.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (Integer value : map.values()) {
            if(value > 0)
                answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        Main main = new Main();
        String solution = main.Solution(s1, s2);
        System.out.println(solution);

    }

}
