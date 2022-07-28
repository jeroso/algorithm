package BOJ_basic.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1998년생인 내가 태국에서는 2541년생?!
public class Main_18108 {
    static int year;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        year = Integer.parseInt(br.readLine());

        System.out.println(year - 543);
    }

}
