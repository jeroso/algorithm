package BOJ_basic.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ??!
public class Main_10926 {
    static String input;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        input = br.readLine();

        System.out.println(sb.append(input).append("??!"));
    }

}
