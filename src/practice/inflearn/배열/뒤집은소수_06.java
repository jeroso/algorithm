package practice.inflearn.배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수_06 {
    public boolean isPrime(int n) {
        if(n == 1) return false;
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public List<Integer> solution(List<String> arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int res = Integer.parseInt(new StringBuilder(arr.get(i)).reverse().toString());
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        뒤집은소수_06 main = new 뒤집은소수_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        List<Integer> solution = main.solution(arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }
    }
}
