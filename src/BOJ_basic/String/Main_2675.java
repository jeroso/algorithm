package BOJ_basic.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//문자열 반복
public class Main_2675 {
    static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            String s = arr[1];
            for (int k = 0; k < s.length(); k++) {
                for (int j = 0; j < n; j++) {
                    sb.append(s.charAt(k));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
