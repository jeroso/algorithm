package Inflearn.Section00;

import BOJ_basic.FastReader;

public class Main_03_01 {
    public int[] Solution(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];
        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) answer[p3++] = arr1[p1++];
            else answer[p3++] = arr2[p2++];
        }
        while (p1 < arr1.length) answer[p3++] = arr1[p1++];
        while (p2 < arr2.length) answer[p3++] = arr2[p2++];

        return answer;
    }

    public static void main(String[] args) {
        Main_03_01 main = new Main_03_01();

        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr1 = new int[n];
        int k = fr.nextInt();
        int[] arr2 = new int[k];

        System.out.println(main.Solution(arr1, arr2));
    }
}
