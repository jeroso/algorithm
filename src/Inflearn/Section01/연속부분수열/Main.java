package Inflearn.Section01.연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 8 6
 1 2 1 3 1 1 1 2
 */
public class Main {
    public int Solution(int[] arr, int ans) {
        int answer = 0, sum = 0;
        int p1 = 0, p2 = 0;
        sum = arr[p1];
        while (p1 < arr.length-1 && p2 < arr.length-1) {
            if (sum == ans) {
                answer++;
                sum = arr[++p1];
                p2 = p1;
            } else if (sum < ans) { //합보다 작을 때 p2 이동 후 값 더함
                sum += arr[++p2];
            }else{  //합보다 클땐 p1값 뺀 후 p1 이동
                sum -= arr[p1++];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int ans = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Main main = new Main();
        int solution = main.Solution(arr, ans);
        System.out.println(solution);
    }
}
