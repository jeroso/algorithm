package BOJ_basic.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 윤년
public class Main_2753 {
    static int year;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        year = Integer.parseInt(br.readLine());

        if (year % 4 == 0 && year % 100 !=  0 || year % 400 == 0) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
