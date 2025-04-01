package practice.inflearn.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오_결정알고리즘_09 {

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > capacity) {
                cnt++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr) {
        //결정 알고리즘: 문제의 답이 예를 들어 0 ~ 100 사이에 답이 있다고 가정하고 출발
        // lt, rt, mid 값을 이용하여 해당 mid 값이 조건에 맞는지를 찾으며 최소값을 찾는다.
        Arrays.sort(arr);
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(), rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid -1;
            } else {
                lt = mid + 1;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        뮤직비디오_결정알고리즘_09 main = new 뮤직비디오_결정알고리즘_09();
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
