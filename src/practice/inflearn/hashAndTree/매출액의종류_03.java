package practice.inflearn.hashAndTree;

import java.util.*;

public class 매출액의종류_03 {
    public List<Integer> solution(int n, int m, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int lt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int rt = m -1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        매출액의종류_03 main = new 매출액의종류_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> solution = main.solution(n, m, arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }
    }
}
