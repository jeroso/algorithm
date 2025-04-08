package practice.programmers.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/250125
public class 이웃한칸 {
    // 내가 푼 방법
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int nx = w + dx[i];
            int ny = h + dy[i];
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length && board[h][w].equals(board[ny][nx])) {
                String s = board[ny][nx];
                System.out.println(s);
                answer++;
            }
        }
        return answer;
    }

    //다른사람이 푼 방식
    public int solution2(String[][] board, int h, int w) {
        int answer = 0;
        String sC = board[h][w];

        if(h > 0 && sC.equals(board[h-1][w])) answer++;
        if(h < board.length - 1 && sC.equals(board[h+1][w])) answer++;
        if(w > 0 && sC.equals(board[h][w-1])) answer++;
        if(w < board[h].length - 1 && sC.equals(board[h][w+1])) answer++;
        return answer;
    }

    public static void main(String[] args) {
        이웃한칸 main = new 이웃한칸();
        String[][] board = {{"blue", "red", "orange", "red"},{"red", "red", "blue", "orange"},{"blue", "orange", "red", "red"},{"orange", "orange", "red", "blue"}};
//        String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h = 0;
//        int h = 2;
        int w = 0;
//        int w = 1;
        int solution = main.solution(board, h, w);
        System.out.println(solution);
    }
}
