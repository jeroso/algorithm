package BOJ_basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//평균
public class Main_1546 {
    static int N;
    public static void main(String[] args) {
        double ans = 0;
        double M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        M = Arrays.stream(arr).max().getAsInt();

        for (int i : arr) {
            ans += (i / M) * 100.0;
        }
        System.out.println(ans / N);
    }
}
