package Inflearn.Section07.이진수출력;

import BOJ_basic.FastReader;

public class Main {
    public void DFS(int n) {
        if (n == 0) return; // n이 0이면 종료
        else {
            DFS(n / 2); // n을 2로 나눈 몫을 인자로 재귀호출
            System.out.print(n % 2); // n을 2로 나눈 나머지 출력
        }
    }

    public void Solution(int n) {
        DFS(n);
    }

    public static void main(String[] args) {
        Main main = new Main();
        FastReader fr = new FastReader();
        int i = fr.nextInt();
        main.Solution(i);  // 1011
    }
}
