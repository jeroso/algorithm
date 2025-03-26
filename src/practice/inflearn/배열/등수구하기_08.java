package practice.inflearn.배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 등수구하기_08 {
//5
//87 89 92 100 76
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] < arr[j]) cnt ++;
            }
            answer.add(cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        등수구하기_08 main = new 등수구하기_08();
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
