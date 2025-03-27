package practice.inflearn.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 최대길이_연속부분수열_06 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while (cnt > m) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        최대길이_연속부분수열_06 main = new 최대길이_연속부분수열_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = main.solution(n, m, arr);
        System.out.println(solution);
    }
}
