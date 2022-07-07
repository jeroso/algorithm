package BOJ_basic.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

// 숫자의 합
public class Main_11720 {
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();  //의미없음
        for (byte value : br.readLine().getBytes(StandardCharsets.UTF_8)) {
            sum += value - '0';
        }
        System.out.println(sum);
    }

}
