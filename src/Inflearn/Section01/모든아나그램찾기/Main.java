package Inflearn.Section01.모든아나그램찾기;

import BOJ_basic.FastReader;
import programmers.신규아이디추천.Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public int Solution(String  S, String  T) {
        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for (char c : T.toCharArray()) {
            am.put(c, am.getOrDefault(c, 0) + 1);
        }
        int L = T.length() - 1;
        for (int i = 0; i < L; i++) {
            bm.put(S.charAt(i), bm.getOrDefault(S.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = L; rt < S.length(); rt++) {
            am.put(S.charAt(rt), am.getOrDefault(S.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;
            am.put(S.charAt(lt), am.get(S.charAt(lt) - 1));
            if(am.get(S.charAt(lt)) == 0) am.remove(S.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();

        String S = scan.next();
        String  T = scan.next();
        Main main = new Main();
        int solution = main.Solution(S, T);
        System.out.println("solution = " + solution);
    }
}
