package Inflearn.Section01.단어뒤집기;

import programmers.신규아이디추천.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> Solution(List<String> str) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            answer.add(String.valueOf(sb.append(s).reverse()));
            sb.setLength(0);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        List<String> solution = main.Solution(list);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
