package BOJ_basic.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//상수
public class Main_2908 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();

        A = new StringBuilder(A).reverse().toString();
        B = new StringBuilder(B).reverse().toString();
        
        String ans = Integer.parseInt(A) > Integer.parseInt(B) ? A : B;

        System.out.println("ans = " + ans);
    }
}
