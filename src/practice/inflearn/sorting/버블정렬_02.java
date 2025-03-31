package practice.inflearn.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 버블정렬_02 {

    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        for (int i1 : arr) {
            answer.add(i1);
        }
        return answer;
    }
    public static void main(String[] args) {
        버블정렬_02 main = new 버블정렬_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> solution = main.solution(arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }

    }
}
