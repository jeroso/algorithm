package BOJ_basic.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주유소
public class Main_13305 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] distance = new int[N - 1];
        int[] cost = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int minCost = cost[0];

        for (int i = 0; i < N - 1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }

            sum += (minCost * distance[i]);
        }
        System.out.println(sum);
    }
}
