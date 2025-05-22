package practice.inflearn.recursiveAndTreeAndGraph;

import java.util.Scanner;

public class 부분집합구하기_DFS_06 {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1) tmp += (i + " ");
            }
            if(tmp.length() >0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
    public static void main(String[] args) {
        부분집합구하기_DFS_06 main = new 부분집합구하기_DFS_06();
        n = 3;
        ch = new int[n + 1];
        main.DFS(1);
    }
}
