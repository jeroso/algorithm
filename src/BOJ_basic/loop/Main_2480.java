package BOJ_basic.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주사위 세개
public class Main_2480 {
    static int a, b, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int ans = 0;
        if (a != b && b != c && a != c) {   //a,b,c 모두 다른 경우
            int max = 0;    //a,b,c 중 가장 큰수 찾기
            if(a > b){
                if (a > c) {
                    max = a;
                }else{
                    max = c;
                }
            }else{
                if (b > c) {
                    max = b;
                }else{
                    max = c;
                }
            }
            ans = max * 100;
        }else{
            if (a == b && b == c) {  // 모두 같은 경우
                ans = 10000 + (a * 1000);
            }else{  // 두개만 같은 경우
                if (a == b || a == c) {  //a, b or a, c 같은 경우
                    ans = 1000 + (a * 100);
                }else{  //b, c 같은 경우
                    ans = 1000 + (b * 100);
                }
            }
        }
        System.out.println(ans);
    }
}
