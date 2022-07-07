package BOJ_basic.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//숫자의 개수
public class Main_2577 {
    static int[] arr = new int[10];
    static int a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arrays.fill(arr, 0);
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        int sum = a * b * c;
        String s = String.valueOf(sum);

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'0']++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
