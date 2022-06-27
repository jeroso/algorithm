package BOJ_basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//최대값
public class Main_2562 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxIndex = 0;
        int maxValue = 0;
        int[] ans = new int[9];
        for (int i = 0; i < 9; i++) {
            ans[i] = sc.nextInt();

            if (ans[i] > maxValue) {
                maxValue = ans[i];
                maxIndex = i + 1;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
