package programmers.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        Solution(participant, completion);
        Arrays.sort(participant);
        Arrays.sort(completion);
        System.out.println("participant");
        System.out.println(Arrays.toString(participant));
        System.out.println("completion");
        System.out.println(Arrays.toString(completion));
    }

    public static String Solution(String[] participant, String[] completion) {
        String answer = "";
        int val = 0;

        Map<String, Integer> hm = new HashMap<>();

        for(String part : participant){
            if(hm.get(part) == null) {
                hm.put(part, 1);
            }else{
                val = hm.get(part) + 1;
                hm.put(part, val);
            }
        }
        System.out.println("hashMap");
        System.out.println(hm.entrySet());

        return answer;
    }
}
