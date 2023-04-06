package Inflearn.Section01.매줄액의종류;

import BOJ_basic.FastReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
7 4
20 12 20 10 23 17 10
 */
public class Main {
    public List<Integer> Solution(int[] arr, int K, int N) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> HM = new HashMap<>();
        int lt = 0;
        for (int i = 0; i < K - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        for (int rt = K -1; rt < N; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception{
        FastReader scan = new FastReader();

        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        Main main = new Main();
        List<Integer> solution = main.Solution(arr, K, N);
        System.out.println(solution.toString());
    }

}
