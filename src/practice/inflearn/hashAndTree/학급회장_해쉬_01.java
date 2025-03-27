package practice.inflearn.hashAndTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급회장_해쉬_01 {
    public String solution(int n, String text) {
        String answer = "";
        int size = 0;
        Map<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hash.put(text.charAt(i), hash.getOrDefault(text.charAt(i), 0) + 1);
        }
//        for (Map.Entry<Character, Integer> characterIntegerEntry : hash.entrySet()) {
//            if(size < characterIntegerEntry.getValue()) {
//                size = characterIntegerEntry.getValue();
//                answer = characterIntegerEntry.getKey().toString();
//            }
//        }
        //강의에서 좀 더 간단히 구현
        for (Character c : hash.keySet()) {
            if(size < hash.get(c)) {
                size = hash.get(c);
                answer = c.toString();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        학급회장_해쉬_01 main = new 학급회장_해쉬_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String text = sc.next();
        String solution = main.solution(n, text);
        System.out.println(solution);
    }
}
