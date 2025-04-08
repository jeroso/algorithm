package practice.programmers.level1;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class 기사단원의무기 {

    static int countDivisorsOptimized(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++; // i는 약수
                if (i != n / i) count++; // n/i도 약수 (중복 방지)
            }
        }
        return count;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {
            int n = countDivisorsOptimized(i);
            if (n > limit) {
                arr[i - 1] = power;
            } else {
                arr[i - 1] = n;
            }
        }
        answer = Arrays.stream(arr).sum();
        return answer;
    }
    //다른 사람 풀이
    public int solution2(int number, int limit, int power) {
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        기사단원의무기 main = new 기사단원의무기();
        int number = 5;
        int limit = 3;
        int power = 2;
        int solution = main.solution(number, limit, power);
        System.out.println(solution);
    }
}
