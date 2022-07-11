package BOJ_basic.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기
public class Main_1463 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        System.out.println(rec_func(N, 0));
    }

    // 재귀
    static int rec_func(int N, int count) {
        if (N < 2) {
            return count;
        }
        return Math.min(rec_func(N / 2, count + 1 + (N % 2)), rec_func(N / 3, count + 1 + (N % 3)));
    }
}
