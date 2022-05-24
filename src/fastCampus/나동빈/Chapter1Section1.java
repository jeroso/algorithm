package fastCampus.나동빈;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//전구
public class Chapter1Section1 {
    static StringBuilder sb = new StringBuilder();


    //전구 개수
    static int N;
    //입력되는 명령어 개수
    static int M;

    static void input(){

    }

    static void rec_func(){

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] answer = new int[Integer.parseInt(str[0])];

        int a, b, c;

        Arrays.fill(answer, 0);
        for (int i : answer) {
            System.out.printf(i + " ");
        }
        for (int i = 0; i < Integer.parseInt(str[1]); i++) {
            String[] type = br.readLine().split(" ");

        }
    }



}
