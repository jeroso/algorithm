package practice.inflearn.hashAndTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램_해쉬_02 {

    public String solution(String text1, String text2) {
        String answer = "YES";
        Map<Character, Integer> hash = new HashMap<>();
        for (char ch : text1.toCharArray()) {
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
//        for (char ch : text2.toCharArray()) {
//            hash.put(ch, hash.getOrDefault(ch, 0) - 1);
//        }
//
//        for (Integer value : hash.values()) {
//            if(value != 0 ) answer = "NO";
//        }
        //강의
        for (char ch : text2.toCharArray()) {
            if(!hash.containsKey(ch) || hash.get(ch) == 0) return "NO";
            hash.put(ch, hash.get(ch) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        아나그램_해쉬_02 main = new 아나그램_해쉬_02();
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        String solution = main.solution(text1, text2);
        System.out.println(solution);
    }
}
