package programmers.level1;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// 수정 필요 => 같은 신고일 경우 1번으로
public class Main_신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] reporter = new String[report.length];
        String[] reported = new String[report.length];
        boolean flag = false;
        HashMap<String, Integer> reportedCount = new HashMap<>();
        for (String s : id_list) {
            reportedCount.put(s, 0);
        }
        for (int i = 0; i < report.length; i++) {
            reporter[i] = report[i].split(" ")[0];  // ["muzi", "apeach", "frodo", "muzi", "apeach"]
            reported[i] = report[i].split(" ")[1];  // ["frodo", "frodo", "neo", "neo", "muzi"]
            reportedCount.put(reported[i], reportedCount.get(reported[i]) + 1);
        }
        for (int i = 0; i < report.length; i++) {
            if(reportedCount.get(reported[i]) >= k)
                answer[Arrays.asList(id_list).indexOf(reporter[i])] += 1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
//        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] idList = {"con", "ryan"};
//        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};

        int k = 3;
        int[] solution = solution(idList, report, k);
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i : solution) {
            sb.append(i).append(" ");
        }
        sb.append("]");
        System.out.println(sb);
    }


}
