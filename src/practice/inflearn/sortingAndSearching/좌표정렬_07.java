package practice.inflearn.sortingAndSearching;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
public class 좌표정렬_07 {
    public static void main(String[] args) {
        좌표정렬_07 main = new 좌표정렬_07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);

        for (Point point : arr) {
            System.out.print(point.x + " " + point.y);
            System.out.println();
        }
    }
}
