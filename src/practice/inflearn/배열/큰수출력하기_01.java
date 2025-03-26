package practice.inflearn.배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기_01 {

    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i -1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        큰수출력하기_01 main = new 큰수출력하기_01();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = new int[i + 1];
        for (int j = 1; j < i + 1; j++) {
            arr[j] = sc.nextInt();
        }
        List<Integer> solution = main.solution(arr);
        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }

    }
}
