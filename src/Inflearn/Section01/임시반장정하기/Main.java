package Inflearn.Section01.임시반장정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int Solution(int n, int[][] arr) {
        int answer = 0; int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][6];
            for (int k = 1; k <= n; k++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int l = 1; l <= n; l++) {
                    arr[k][l] = Integer.parseInt(st.nextToken());
                }
            }

        int solution = main.Solution(n, arr);
        System.out.println(solution);
    }
}
