package practice.inflearn.sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 장난꾸러기_06 {

    public List<Integer> solution(int n, int[] arr) {
        //110 130 120 140
        //110 120 130 140 > sorting temp 배열
        //다른 값이 바뀐자리 앞은 철수 뒤는 짝궁
        List<Integer> answer = new ArrayList<>();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if(arr[i] != temp[i]) answer.add(i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        장난꾸러기_06 main = new 장난꾸러기_06();
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
