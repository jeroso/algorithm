package programmers.kakao.오픈채팅방;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        int leng = 0;
        Map<String, String> list = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            try {
                list.put(record[i].split(" ")[1], record[i].split(" ")[2]);
            } catch (Exception e) {
                list.put(record[i].split(" ")[1], " ");
            }
            if(!record[i].split(" ")[0].equals("Change")) leng++;
        }
        answer = new String[leng];
        for (int i = 0; i < leng; i++) {
            if (record[i].split(" ")[0].equals("Enter")) {
                answer[i] = list.get(record[i].split(" ")[1]) + "님이 들어왔습니다.";
            } else if (record[i].split(" ")[0].equals("Leave")) {
                answer[i] = list.get(record[i].split(" ")[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        for (String rec:
             sol.solution(record)) {
            System.out.println(rec);
        }
    }
}
