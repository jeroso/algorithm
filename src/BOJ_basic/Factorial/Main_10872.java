package BOJ_basic.Factorial;

import java.util.Scanner;

// 펙토리얼
public class Main_10872 {
    static int factorial_func(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial_func(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_func(n));
    }
}

