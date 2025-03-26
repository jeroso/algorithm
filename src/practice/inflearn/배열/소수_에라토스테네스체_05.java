package practice.inflearn.배열;

import java.util.Scanner;

public class 소수_에라토스테네스체_05 {

    public int solution(int n) {
        int answer = 0;
        //배열을 만들어 2부터 시작하여 배수들을 체크 '0'인 경우 answer 에 추가
        int[] arr = new int[n];
        for (int i = 2; i < n; i++) {
            if(arr[i] == 0) {
                answer++;
                for (int j = i; j < n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        소수_에라토스테네스체_05 main = new 소수_에라토스테네스체_05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solution = main.solution(n);
        System.out.println(solution);
    }
}