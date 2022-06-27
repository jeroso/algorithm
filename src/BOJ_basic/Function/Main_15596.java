package BOJ_basic.Function;

import java.util.Arrays;
import java.util.Scanner;

//정수 N개의 합
public class Main_15596 {
    static int n;
    public int solution(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main_15596 sol = new Main_15596();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sol.solution(arr));
    }



}
