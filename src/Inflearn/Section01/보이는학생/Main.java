package Inflearn.Section01.보이는학생;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public int Solution(int[] list) {
        int answer = 0;
        int temp = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if(temp < integer){
                answer++;
                temp = integer;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int solution = main.Solution(arr);
        System.out.println("solution = " + solution);
    }
}
