package practice.inflearn.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기_카카오_03 {

    public int solution(int n, int m, int[][] arr, int[] move) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : move) {    // 1 5 3 5 1 2 1 4
            for (int j = 0; j < n; j++) {
                int temp = arr[j][i - 1];
                arr[j][i - 1] = 0;
                if (temp != 0) {
                    if(!stack.empty() && stack.peek() == temp) {
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(temp);
                        break;
                    }
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        크레인_인형뽑기_카카오_03 main = new 크레인_인형뽑기_카카오_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] move = new int[m];
        for (int i = 0; i < m; i++) {
            move[i] = sc.nextInt();
        }
        int solution = main.solution(n, m, arr, move);
        System.out.println(solution);
    }
}
