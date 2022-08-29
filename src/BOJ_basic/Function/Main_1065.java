package BOJ_basic.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 한수
 *  등차수열 : An = A1 + (n - 1)d
 * */
public class Main_1065 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(sequence_func(Integer.parseInt(br.readLine())));
    }

    static int sequence_func(int num) {
        int cnt = 0;
        if (num < 100) {
            return num;
        }else{
            cnt = 99;
            for (int i = 100; i <= num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
            return cnt;
        }
    }
}
