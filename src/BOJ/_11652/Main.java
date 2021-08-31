package BOJ._11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//카드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int ans = arr[0];
        int max_cnt = 1;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
            }else{
                cnt = 1;
            }
            if (max_cnt < cnt) {
                max_cnt = cnt;
                ans = arr[i];
            }
        }
        System.out.println("ans = " + ans);
    }
}
