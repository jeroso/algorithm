package practice.inflearn.문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 문자열압축_11 {

    public String solution(String str) {
        // KKHSSSSSSSE
        String answer = "";
        /**
         * 내가 푼 방법
        Map<Character, Integer> maps = new HashMap<>();
        for (char ch : str.toCharArray()) {
            maps.put(ch, maps.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (maps.get(ch) != null) {
                if (maps.get(ch) != 1) {
                    answer += (ch + maps.get(ch).toString());
                } else{
                    answer += ch;
                }
                maps.remove(ch);
            }
        }
        */

        // for 문을 돌면서 다음 문자가 현재 문자와 같다면 cnt 증가, 다르면 answer 에 문자와 숫자 저장
        // 마지막 값은 다음 값이 없기 때문에 그냥 cnt 저장
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            // 마지막 체크를 위해 s = s+ " " 로 해서 str.length() -1 까지 도는 방법도 있음
            if (i != str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }else{
                String c = (cnt == 1) ? "" : String.valueOf(cnt) ;
                answer += (str.charAt(i) + c);
                cnt = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문자열압축_11 main = new 문자열압축_11();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String solution = main.solution(next);
        System.out.println(solution);
    }
}
