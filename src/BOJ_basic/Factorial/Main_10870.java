package BOJ_basic.Factorial;

import java.util.Scanner;

//피보나치 수 5
public class Main_10870 {
    static int fivo_func(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fivo_func(n - 1) + fivo_func(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fivo_func(sc.nextInt()));
    }

}
