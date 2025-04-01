package practice.inflearn.recursiveAndTreeAndGraph;

import java.util.List;

public class 재귀함수_스택프레임_01 {

    public void DFS(int n) {
        if(n == 0 ) return;
        DFS(n -1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        재귀함수_스택프레임_01 main = new 재귀함수_스택프레임_01();
        main.DFS(3);
    }
}
