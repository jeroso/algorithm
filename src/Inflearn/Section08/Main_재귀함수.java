package Inflearn.Section08;

public class Main_재귀함수 {


    public int[] solution(int n) {
        int[] answer = new int[n];
        DFS(n, answer);
        return answer;
    }

    public void DFS(int n, int[] answer) {
        if (n == 0) return;
        else {
            DFS(n - 1, answer);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main_재귀함수 main = new Main_재귀함수();

    }
}
