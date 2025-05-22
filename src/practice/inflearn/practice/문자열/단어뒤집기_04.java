package practice.inflearn.practice.문자열;

import java.util.Scanner;

public class 단어뒤집기_04 {

    public void solution(String[] list) {
        System.out.println( list.length);
        for (String s : list) {
            String answer = new StringBuilder(s).reverse().toString();
            System.out.println(answer);
        }
    }
    public static void main(String[] args) {
        단어뒤집기_04 main = new 단어뒤집기_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }
        main.solution(list);
    }
}
