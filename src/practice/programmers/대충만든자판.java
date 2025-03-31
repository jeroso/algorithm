package practice.programmers;

import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            int temp = 1;
            for (char ch : keymap[i].toCharArray()) {
                maps.put(ch, Math.min(maps.getOrDefault(ch, Integer.MAX_VALUE), temp));
                temp++;
            }
        }
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if(maps.get(c) == null) {
                    sum =  -1;
                    break;
                }
                else{
                    sum += maps.get(c);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        대충만든자판 main = new 대충만든자판();
        String[] keymap = {"ABACD", "BCEFD"};
//        String[] keymap = {"AA"};
        String[] target = {"ABCD", "AABB"};
//        String[] target = {"B"};
        int[] solution = main.solution(keymap, target);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
