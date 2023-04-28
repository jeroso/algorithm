package Inflearn.Section05.크레인인형뽑기_카카오;


import BOJ_basic.FastReader;

import java.util.Arrays;
import java.util.Stack;

/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4

4
*/
public class Main {
    public int Solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    int temp = board[i][move - 1];
                    board[i][move -1] = 0;
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(board[i][move - 1]);
                        break; // 중요
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        int N = scan.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = scan.nextInt();
            }
        }
        int cnt = scan.nextInt();
        int[] moves = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            moves[i] = scan.nextInt();
        }
        String s = Arrays.deepToString(board);
        Main main = new Main();
        int solution = main.Solution(board, moves);
        System.out.println(solution);
    }

}
