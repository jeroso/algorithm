package Inflearn.Section01.피보나치수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public int[] Solution(int i) {
        int[] arr = new int[i -1];
        arr[0] = 1;
        arr[1] = 2;
        for (int j = 2; j < i -1; j++) {
            arr[j] = arr[j - 2] + arr[j - 1];
        }
        return arr;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        int[] solution = main.Solution(i);
        for (int i1 : solution) {
            System.out.print(i1 + " ");
        }
    }
}

