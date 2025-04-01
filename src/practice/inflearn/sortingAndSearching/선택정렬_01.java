package practice.inflearn.sortingAndSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 선택정렬_01 {
    // 가장 작은 값 선택 후 맨앞에 데이터와 교체
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int lower = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[lower] > arr[j]) {
                    lower = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lower];
            arr[lower] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
            answer.add(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        선택정렬_01 main = new 선택정렬_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> solution = main.solution(arr);
//        for (Integer i : solution) {
//            System.out.print(i + " ");
//        }
    }
}
