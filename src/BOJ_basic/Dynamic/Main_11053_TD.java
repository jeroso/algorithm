package BOJ_basic.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가장 긴 증가하는 부분
//dp[] 를 사용한 TOP-DOWN 방식(재귀활용)
public class Main_11053_TD {
    static Integer[] dp;
    static int[] seq;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        seq = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            LTS(i);
        }
        int max = dp[0];
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    static int LTS(int N) {
        //탐색하지 않았던 경우
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LTS(i) + 1);
                }
            }
        }
        return dp[N];
    }

}
