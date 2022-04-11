package programmers.practice_kit.Hash.완주하지못한선수;

import java.util.*;

public class Main {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
//  내가 푼 방법
/*        boolean chn = false;
        for (int i = 0; i < completion.length; i++) {
            if (participant[i] != completion[i]) {
                answer = participant[i];
                chn =true;
            }
            if (!chn) {
                answer = participant[participant.length - 1];
            }
        }
        return answer;
*/
//  깔끔한 방법 => i를 밖으로 빼면서 i++로 인해 i는 participant 마지막 값까지 갖게 되며 for 문은 돌지 않는다.
/*        int i = 0;
        for (; i < completion.length; i++)
            if(!participant[i].equals(completion[i]))
                break;
        return participant[i];
*/
        // HashMap 사용
        HashMap<String, Integer> hm = new HashMap<>();
        for (String part : participant) {
            hm.put(part, hm.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            hm.put(comp, hm.get(comp) -1);
        }
//    keyset 사용
/*        for (String key :
                hm.keySet()) {
            if (hm.get(key) == 1) {
                answer = key;
            }
        }
 */
        Iterator<Map.Entry<String, Integer>> iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] part = {"mislav", "stanko", "mislav", "ana"};
//        String[] comp = {"josipa", "filipa", "marina", "nikola"};
        String[] comp = {"stanko", "ana", "mislav"};
        Main main = new Main();
        System.out.println(main.solution(part, comp));
    }
}
