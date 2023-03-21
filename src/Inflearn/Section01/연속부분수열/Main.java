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
        int lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum+=arr[rt];
            if(sum==ans) answer++;
            while(sum>=ans){
                sum-=arr[lt++];
                if(sum==ans) answer++;
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
