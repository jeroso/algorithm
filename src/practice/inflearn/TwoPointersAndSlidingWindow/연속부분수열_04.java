package practice.inflearn.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 연속부분수열_04 {
    //내가 푼 방법
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == m) answer++;
                else if(sum > m) break;
            }
        }
        return answer;
    }

    public int solution2(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }
    //강의

    public static void main(String[] args) {
        연속부분수열_04 main = new 연속부분수열_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int solution = main.solution(n, m, arr);
        int solution = main.solution2(n, m, arr);
        System.out.println(solution);
    }
}
