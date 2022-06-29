package BOJ_basic.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//알람 시계
public class Main_2884 {
    static int H, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        if (M >= 45) {
            System.out.println(sb.append(H + " " +(M - 45)));
        }else{
            H--;
            if (H < 0) {
                H = 23;
            }
            System.out.println(sb.append(H + " " + ( 15 + M)));
        }
    }
}
