package Inflearn.Section01.공통원소구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public List<Integer> Solution(int[] arr1, int[] arr2) {
        int p1 = 0, p2 = 0;
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] == arr2[p2]) answer.add(arr1[p1]);
            if (arr1[p1] < arr2[p2]) {
                p1++;
            }else{
                p2++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[i];
        for (int j = 0; j < i; j++) {
            arr1[j] = Integer.parseInt(st.nextToken());
        }
        int n = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {

            arr2[j] = Integer.parseInt(st2.nextToken());
        }
        Main main = new Main();
        List<Integer> solution = main.Solution(arr1, arr2);
        System.out.println(solution.toString());
    }
}
