package practice.inflearn.recursiveAndTreeAndGraph;

public class 이진수출력_재귀_02 {

    public void DFS(int n) {
        if(n==0) return;
        DFS(n / 2);
        System.out.print(n % 2 + " ");
    }

    public static void main(String[] args) {
        이진수출력_재귀_02 main = new 이진수출력_재귀_02();
        main.DFS(11);
    }
}
