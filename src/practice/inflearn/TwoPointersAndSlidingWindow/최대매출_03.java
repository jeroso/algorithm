package practice.inflearn.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 최대매출_03 {
    //내가 푼 방법 > 타임아웃 발생
    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n - m - 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    //강의
    public int solution2(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        //처음 세개 합
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int j = m; j < n; j++) {
            //12 15 11 20 의 경우 20 -12 값을 더하여 처리
            sum += (arr[j] - arr[j - m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        최대매출_03 main = new 최대매출_03();
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
