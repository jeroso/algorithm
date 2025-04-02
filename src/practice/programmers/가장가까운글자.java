package practice.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class 가장가까운글자 {

    //내가 푼 방식
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                answer.add(i - map.get(s.charAt(i)));
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
                answer.add(-1);
            }
        }
        return answer;
    }

    //다른사람이 푼 방식 > 더 간단한 방법
    public int[] solution2(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }

    public static void main(String[] args) {
        가장가까운글자 main = new 가장가까운글자();
        List<Integer> banana = main.solution("banana");
        for (int i : banana) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> foobars = main.solution("foobar");
        for (int foobar : foobars) {
            System.out.print(foobar + " ");
        }
    }
}
