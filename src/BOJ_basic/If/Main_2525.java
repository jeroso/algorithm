package BOJ_basic.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//오븐 시계
public class Main_2525 {
    static int h, m, t, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(br.readLine());
        sum = m + t;

        if (sum >= 60) {
            h = h + (sum / 60);
            sum = sum % 60;
        }
        if (h >= 24) {
            h = h - 24;
        }
        System.out.println(h + " " + sum);
    }
}
