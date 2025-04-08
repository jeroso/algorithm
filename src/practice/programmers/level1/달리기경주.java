package practice.programmers.level1;

import java.util.*;

public class 달리기경주 {
    //시간초과 실패
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        List<String> ansArr = Arrays.asList(players);
        for (int i = 0; i < callings.length; i++) {
            int index = ansArr.indexOf(callings[i]);
            String temp = answer[index];
            answer[index] = answer[index - 1];
            answer[index - 1] = temp;
        }
        return answer;
    }

    public String[] solution2(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(answer[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            Integer rank = map.get(callings[i]);
            String temp = answer[rank - 1];
            answer[rank - 1] = answer[rank];
            answer[rank] = temp;
            map.put(answer[rank], rank);
            map.put(answer[rank - 1], rank - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        달리기경주 main = new 달리기경주();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] solution = main.solution2(players, callings);
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
