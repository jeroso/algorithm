package Inflearn.Section01.최대매출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 10 3
 12 15 11 20 25 10 20 19 13 15
 */
public class Main {

    public int Solution(int[] arr, int cnt) {
        int answer = arr[0] + arr[1] + arr[2];
        for (int i = cnt; i < arr.length; i++) {
            answer = Math.max(answer, answer + arr[i] - arr[i - cnt]);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Main main = new Main();
        int solution = main.Solution(arr, count);
        System.out.println(solution);
    }
}
