package Inflearn.Section00;

import BOJ_basic.FastReader;

public class Main_03_04 {
    public int Solution(int[] arr, int n) {
        int answer = 0, sum = 0;


        return answer;
    }

    public static void main(String[] args) {
        Main_03_04 main = new Main_03_04();

        FastReader fr = new FastReader();
        int i = fr.nextInt();
        int n = fr.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = fr.nextInt();
        }
        System.out.println(main.Solution(arr, n));
    }
}
