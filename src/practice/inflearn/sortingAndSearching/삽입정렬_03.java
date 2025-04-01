package practice.inflearn.sortingAndSearching;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 삽입정렬_03 {

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        //2번째 부터 시작하여 마지막 까지 앞에 있는 숫자들과 비교하여 교환
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i : arr) {
            answer.add(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        삽입정렬_03 main = new 삽입정렬_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> solution = main.solution(n, arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }
    }
}
