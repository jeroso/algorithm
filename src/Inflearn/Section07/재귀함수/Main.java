package Inflearn.Section07.재귀함수;

public class Main {

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.println(n + " ");
        }
    }

    public void solution(int n) {
        DFS(n);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.DFS(3);
    }
}
