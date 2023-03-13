package Inflearn.Section01.두배열합차기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/*
3
1 3 5
5
2 3 6 7 9
 */
public class Main {
    public List<Integer> Solution(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1< arr1.length) answer.add(arr1[p1++]);
        while (p2< arr2.length) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int i = Integer.parseInt(br.readLine());
        int[] arr2 = new int[i];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int j = 0; j < i; j++) {
            arr2[j] = Integer.parseInt(st2.nextToken());
        }
        List<Integer> solution = main.Solution(arr1, arr2);
        System.out.println(solution.toString());
    }
}

