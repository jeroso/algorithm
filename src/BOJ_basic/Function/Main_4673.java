package BOJ_basic.Function;

import java.util.Scanner;

//셀프넘버
public class Main_4673 {
    static int n;
    static int sum;
    static int rec_func(int n) {

        System.out.println(n / 10);
        if (n / 10 > 0) {
            rec_func(n / 10);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rec_func(sc.nextInt());
    }
}
