package BOJ_basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//나머지
public class Main_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];
        Arrays.fill(arr, 0);
        int ans = 0;
        for (int i = 0; i <10; i++) {
            int n = sc.nextInt();
            if(arr[n % 42] == 0) ans++;
            arr[n % 42] = 1;
        }
        System.out.println(ans);
    }
}
