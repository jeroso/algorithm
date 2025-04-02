package practice.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/258712
public class 가장많이받은선물 {
    //내가 푼 방식
    public int solution(String[] friends, String[] gifts) {
        //가장 많이 받은 선물의 수 리턴
        int answer = 0;
        int[][] arr = new int[friends.length][friends.length];
        int[] arr2 = new int[friends.length];
        int[] result = new int[friends.length];
        List<String> list = Arrays.asList(friends);
        for (int i = 0; i < gifts.length; i++) {
            String[] p = gifts[i].split(" ");
            arr[list.indexOf(p[0])][list.indexOf(p[1])] += 1;
            arr2[list.indexOf(p[0])] += 1;
            arr2[list.indexOf(p[1])] -= 1;
        }
        for (int i = 0; i < friends.length -1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    if(arr2[i] > arr2[j]) result[i]++;
                    else if(arr2[i] < arr2[j]) result[j]++;
                    else continue;
                } else if (arr[i][j] > arr[j][i]) {
                    result[i]++;
                } else {
                    result[j]++;
                }
            }
        }
        answer = Arrays.stream(result).max().getAsInt();
        return answer;
    }

    //다른 사람 풀이
        public int solution2(String[] friends, String[] gifts) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < friends.length; i++) {
                map.put(friends[i], i);
            }
            int[] index = new int[friends.length];
            int[][] record = new int[friends.length][friends.length];

            for (String str : gifts) {
                String[] cur = str.split(" ");
                index[map.get(cur[0])]++;
                index[map.get(cur[1])]--;
                record[map.get(cur[0])][map.get(cur[1])]++;
            }

            int ans = 0;
            for (int i = 0; i < friends.length; i++) {
                int cnt = 0;
                for (int j = 0; j < friends.length; j++) {
                    if(i == j) continue;
                    if (record[i][j] > record[j][i]) cnt++;
                    else if (record[i][j] == record[j][i] && index[i] > index[j]) cnt++;
                }
                ans = Math.max(cnt, ans);
            }
            return ans;
        }

    public static void main(String[] args) {
        가장많이받은선물 main = new 가장많이받은선물();
//        String[] friends = {"muzi", "ryan", "frodo", "neo"};
//        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] friends = {"a", "b", "c"};
//        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
//        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
        int solution = main.solution(friends, gifts);
        System.out.println(solution);
    }
}
