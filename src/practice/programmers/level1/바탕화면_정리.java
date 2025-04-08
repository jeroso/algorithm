package practice.programmers.level1;

public class 바탕화면_정리 {


    //내가 푼 방법
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lx = Integer.MAX_VALUE, ly = Integer.MAX_VALUE, rx = Integer.MIN_VALUE, ry = Integer.MIN_VALUE;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
//                    System.out.println("(" + i + "," + j + ")");
                    lx = Math.min(lx, i);
                    ly = Math.min(ly, j);
                    rx = Math.max(rx, i + 1);
                    ry = Math.max(ry, j + 1);
                }
            }
        }
        answer = new int[]{lx, ly, rx, ry};

        return answer;
    }

    public static void main(String[] args) {
        바탕화면_정리 main = new 바탕화면_정리();
//        String[] wallpaper = {".#...", "..#..", "...#."};
//        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};

        int[] solution = main.solution(wallpaper);
        for (int n : solution) {
            System.out.print(n + " ");
        }
    }
}
