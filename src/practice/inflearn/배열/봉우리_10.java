package practice.inflearn.배열;

import java.util.Scanner;

public class 봉우리_10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    // 내 방법
    public int solution(int[][] arr, int n) {
        //상하좌우보다 큰값
        // i,j -> i+1,j/ i-1,j/ i,j-1/ i, j+1 4개 보다 큰값
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n +1; j++) {
                if (arr[i][j] > arr[i - 1][j]
                        && arr[i][j] > arr[i + 1][j]
                        && arr[i][j] > arr[i][j - 1]
                        && arr[i][j] > arr[i][j + 1]) {
                    answer++;
                }
            }
        }
        return answer;
    }
    //강좌 방법
    public int solution2(int[][] arr, int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        봉우리_10 main = new 봉우리_10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[][] arr = new int[n+2][n+2];
        int[][] arr = new int[n][n];
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 1; j < n+1; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        int solution = main.solution(arr, n);
        int solution = main.solution2(arr, n);
        System.out.println(solution);
    }
}
