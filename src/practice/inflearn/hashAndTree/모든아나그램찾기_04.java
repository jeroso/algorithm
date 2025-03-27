package practice.inflearn.hashAndTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든아나그램찾기_04 {

    public int solution(String text, String str) {
        int answer = 0, lt = 0;
        Map<Character, Integer> bm = new HashMap<>();
        Map<Character, Integer> am = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            bm.put(str.charAt(i), bm.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length() - 1; i++) {
            am.put(text.charAt(i), am.getOrDefault(text.charAt(i), 0) + 1);
        }
        for (int rt = str.length() - 1; rt < text.length(); rt++) {
            am.put(text.charAt(rt), am.getOrDefault(text.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;
            am.put(text.charAt(lt), am.get(text.charAt(lt)) - 1);
            if(am.get(text.charAt(lt)) == 0) am.remove(text.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        모든아나그램찾기_04 main = new 모든아나그램찾기_04();
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String st = sc.next();
        int solution = main.solution(text, st);
        System.out.println(solution);
    }
}
