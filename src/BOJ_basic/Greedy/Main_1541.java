package BOJ_basic.Greedy;

import BOJ_basic.FastReader;

import java.util.StringTokenizer;

// 잃어버린 괄호
public class Main_1541 {
    static FastReader scan = new FastReader();
    static int sum = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String str = scan.nextLine();
        StringTokenizer sub = new StringTokenizer(str, "-");
        while (sub.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while (add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
