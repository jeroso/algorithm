package BOJ_basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//평균은 넘겠지
public class Main_4344 {
    static int C, N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        double[] ans = new double[C];
        for (int i = 0; i < C; i++) {
            N = sc.nextInt();
            int avg = 0;
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            double average = Arrays.stream(arr).average().getAsDouble();
            for (int i1 : arr) {
                if(i1 > average) avg++;
            }
            ans[i] = (avg / (double)arr.length) * 100.000;
        }
        for (double an : ans) {
            System.out.println(String.format("%.3f", an) + "%");
        }
    }
}
