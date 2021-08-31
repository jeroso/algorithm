package BOJ._10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//수정렬하기 3
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            int temp = Integer.valueOf(br.readLine());
            arr[temp] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10000; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
