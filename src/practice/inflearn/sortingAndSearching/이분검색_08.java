package practice.inflearn.sortingAndSearching;


import java.util.Arrays;
import java.util.Scanner;

public class 이분검색_08 {
    //binary search
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, rt = n - 1;
        Arrays.sort(arr);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if(arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        이분검색_08 main = new 이분검색_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = main.solution(n, m, arr);
        System.out.println(solution);
    }
}
