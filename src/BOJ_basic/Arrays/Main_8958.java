package BOJ_basic.Arrays;

import java.util.Scanner;

//OX퀴즈
public class Main_8958 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int plus = 0;
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    plus++;
                }else{
                    plus = 0;
                }
                sum += plus;
            }
            ans[i] = sum;
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
