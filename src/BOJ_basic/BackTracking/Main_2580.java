package BOJ_basic.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스도쿠
public class Main_2580 {
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sudoku(0, 0);
    }

    static void sudoku(int row, int col) {
        //해당 행이 다 채워 지면 다음행의 첫번째 열부터 시작
        if (col == 9) {
            sudoku(row + 1, col);
        }
        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(map[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        // 0인 값은 1~9 가능한 수 탐색
        if (map[row][col] == 0) {
            for (int i = 0; i < 9; i++) {
                if (possibility(row, col, i)) {
                    map[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            map[row][col] = 0;
            return;
        }
        sudoku(row, col + 1);
    }

    // 겹치는 숫자가 있는지 확인하는 메소드
    static boolean possibility(int row, int col, int value) {
        // 같은 행에 있는 원소들 중 겹치는 값이 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (map[row][i] == value) {
                return false;
            }
        }
        // 같은 열에 있는 원소들 중 겹치는 값이 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (map[i][col] == value) {
                return false;
            }
        }

        // 3 * 3 칸에 중복되는 원소가 있는지 검사
        int set_row = (row / 3) * 3;
        int set_col = (col / 3) * 3;

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (map[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }



}
