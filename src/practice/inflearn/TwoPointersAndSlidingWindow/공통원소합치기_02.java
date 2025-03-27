package practice.inflearn.TwoPointersAndSlidingWindow;

import java.util.*;

public class 공통원소합치기_02 {

    public List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        공통원소합치기_02 main = new 공통원소합치기_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> solution = main.solution(n, m, arr1, arr2);
        StringJoiner joiner = new StringJoiner(" ");
        for (Integer i : solution) {
            joiner.add(i.toString());
        }
        System.out.println(joiner);
    }
}
