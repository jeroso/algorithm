package practice.inflearn.배열;

import java.util.Scanner;

public class 멘토링_12 {
    //todo: 복습
    public int solution(int[][] arr, int n, int m) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        멘토링_12 main = new 멘토링_12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int solution = main.solution(arr, n, m);
        System.out.println(solution);
    }
}
