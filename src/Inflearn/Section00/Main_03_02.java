package Inflearn.Section00;

import BOJ_basic.FastReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_03_02 {
    public List<Integer> Solution(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] == arr2[p2]) answer.add(arr1[p1++]);
            if (arr1[p1] < arr2[p2]) {
                p1++;
            }else{
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_03_02 main = new Main_03_02();

        FastReader fs = new FastReader();
        int n = fs.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = fs.nextInt();
        }
        int m = fs.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = fs.nextInt();
        }
        System.out.println(main.Solution(arr1, arr2));
    }
}
