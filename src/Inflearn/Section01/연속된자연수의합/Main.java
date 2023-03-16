package Inflearn.Section01.연속된자연수의합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
    15
 */
public class Main {
    public int Solution(int[] arr , int n) {
        int answer = 0;
        int p1 = 0, p2 = 0;
        int cnt = arr[0];
        while (p1 < arr.length -1  && p2 < arr.length -1) {
            if (cnt == n) {
                answer++;
                cnt = arr[++p1];
                p2 = p1;
            } else if (cnt < n) {
                cnt += arr[++p2];
            } else if (cnt > n) {
                cnt -= arr[p1++];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        Main main = new Main();
        int solution = main.Solution(arr, n);
        System.out.println(solution);
    }
}
