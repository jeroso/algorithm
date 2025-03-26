package practice.inflearn.배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 피보나치수열_04 {
    // 재귀를 이용하지 않고 구현
    public List<Integer> solution(int n) {
        /**
         * 내가 푼 방식
         */
        List<Integer> answer = new ArrayList<>();
        int a = 1, b = 1;
        answer.add(a);
        answer.add(b);
        for (int j = 2; j < n; j++) {
            answer.add(answer.get(j - 2) + answer.get(j - 1));
        }
        return answer;
        /**
         * 강의에서 푼 방식
        int a = 1, b = 1, c;
        System.out.println(a + " "+ b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
        */
    }

    public static void main(String[] args) {
        피보나치수열_04 main = new 피보나치수열_04();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        List<Integer> solution = main.solution(i);
        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
