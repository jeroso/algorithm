package BOJ_basic.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 알파벳 찾기
public class Main_10809 {
    static String s;
    static int[] arr = new int[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 97] != -1) continue;
            arr[s.charAt(i) - 97] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
