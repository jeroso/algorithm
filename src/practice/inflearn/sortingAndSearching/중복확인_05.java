package practice.inflearn.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인_05 {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return "D";
        }
        return answer;
    }



    public static void main(String[] args) {
        중복확인_05 main = new 중복확인_05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String solution = main.solution(n, arr);
        System.out.println(solution);
    }
}
