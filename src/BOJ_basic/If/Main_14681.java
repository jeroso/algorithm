package BOJ_basic.If;

import java.util.Scanner;

// 사분면 고르기
public class Main_14681 {
    static int x, y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y > 0) {
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
    }
}
