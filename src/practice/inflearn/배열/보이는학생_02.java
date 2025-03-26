package practice.inflearn.배열;

import java.util.Scanner;

public class 보이는학생_02 {

    public int solution(int[] arr) {
        int answer = 0;
        int check = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i > check) {
                check = i;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        보이는학생_02 main = new 보이는학생_02();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }
        int solution = main.solution(arr);
        System.out.println(solution);
    }

}
