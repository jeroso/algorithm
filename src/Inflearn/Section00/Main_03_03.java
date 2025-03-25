package Inflearn.Section00;

import BOJ_basic.FastReader;

import java.util.Arrays;

public class Main_03_03 {

    public int Solution(int[] arr, int n) {
        int answer = arr[0] + arr[1] + arr[2];
        int sum = answer;
        for (int i = n; i < arr.length; i++) {
            sum += arr[i] - arr[i - n];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_03_03 main = new Main_03_03();

        FastReader fs = new FastReader();
        int i = fs.nextInt();
        int n = fs.nextInt();

        int[] arr = new int[i];

        for (int j = 0; j < i; j++) {
            arr[j] = fs.nextInt();
        }


        System.out.println(main.Solution(arr, n));
    }
}
