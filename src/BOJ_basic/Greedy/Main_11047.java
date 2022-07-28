package BOJ_basic.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
public class Main_11047 {

    static int n, target;
    static int[] coin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (coin[i] <= target) {
                count += (target / coin[i]);
                target = target % coin[i];
            }
        }
        System.out.println(count);
    }

}
