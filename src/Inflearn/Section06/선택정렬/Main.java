package Inflearn.Section06.선택정렬;

import BOJ_basic.FastReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public List<Integer> Solution(List<Integer> list) {
        int lower;
        for (int i = 0; i < list.size() - 1; i++) {
            lower = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(lower) > list.get(j)) {
                    lower = j;
                }
                Collections.swap(list, lower, i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Main main = new Main();
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        List<Integer> solution = main.Solution(list);
        System.out.println(solution.toString());

    }
}
