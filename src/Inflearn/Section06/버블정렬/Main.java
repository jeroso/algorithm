package Inflearn.Section06.버블정렬;

import BOJ_basic.FastReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public List<Integer> Solution(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swap = false;
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, i, j);
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return list;
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> list = new ArrayList<>();
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        List<Integer> solution = main.Solution(list);
        System.out.println(solution.toString());
    }
}
