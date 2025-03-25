package Inflearn.Section07.팩토리얼;

import BOJ_basic.FastReader;

public class Main {
    public int DFS(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        FastReader fs = new FastReader();
        int i = fs.nextInt();
        System.out.println(main.DFS(i));
    }
}
