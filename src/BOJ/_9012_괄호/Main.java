package BOJ._9012_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int cnt = 0;
            str = str.trim();
            for (int j = 0; j <str.length(); j++) {
                if (str.charAt(j) == '(') {
                    cnt++;
                }else{
                    cnt--;
                }
                if (cnt == 0) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }


    }

}
