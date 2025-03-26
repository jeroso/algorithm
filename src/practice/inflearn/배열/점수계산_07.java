package practice.inflearn.배열;

import java.util.Scanner;

public class 점수계산_07 {

    public int solution(int[] arr) {
        //10
        //1 0 1 1 1 0 0 1 1 0
        int answer = 0;
        int score = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == 1) {
                ++score;
            }
            if(arr[i] == 0) score = 1;
            if(arr[i] == 1) answer+= score;

        }
        return answer;
    }

    public static void main(String[] args) {
        점수계산_07 main = new 점수계산_07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = main.solution(arr);
        System.out.println(solution);
    }
}
