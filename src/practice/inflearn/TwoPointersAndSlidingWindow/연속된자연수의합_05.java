package practice.inflearn.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 연속된자연수의합_05 {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int sum = 0, lt = 0;

        for (int rt = 0; rt < n- 1; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        연속된자연수의합_05 main = new 연속된자연수의합_05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int solution = main.solution(n, arr);
        System.out.println(solution);
    }
}
