package Inflearn.Section01.K번째큰수;

import BOJ_basic.FastReader;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public int Solution(int k, int[] array) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        answer = res.get(k -1);

        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        Main main = new Main();
        int solution = main.Solution(k, array);
        System.out.println(solution);
    }
}
