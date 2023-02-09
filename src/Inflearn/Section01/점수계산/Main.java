package Inflearn.Section01.점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
//10
//1 0 1 1 1 0 0 1 1 0
public int Solution(int[] arr) {
    int answer = 0;
    int cnt = 0;
    for (int i : arr) {
        if (i == 1) {
            answer += ++cnt;
        } else {
            cnt = 0;
        }
    }
    return answer;
}

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int[] arr = new int[i];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < i; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        int solution = main.Solution(arr);
        System.out.println(solution);
    }
}
