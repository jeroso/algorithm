package practice.inflearn.배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1: 가위 2: 바위 3: 보
/**
 5
 2 3 3 1 3
 1 1 2 2 3
 */
public class 가위바위보_03 {

    public List<String> solution(int[] arr1, int[] arr2, int cnt) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int val = arr1[i] - arr2[i];
            if(val == 0) answer.add("D");
            else{
                if(Math.abs(val) == 2) {
                    if(val == -2) {
                        answer.add("A");
                    }else{
                        answer.add("B");
                    }
                } else if (Math.abs(val) == 1) {
                    if (val == 1) {
                        answer.add("A");
                    }else{
                        answer.add("B");
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가위바위보_03 main = new 가위바위보_03();

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr1 = new int[cnt];
        int[] arr2 = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            arr2[i] = sc.nextInt();
        }
        List<String> solution = main.solution(arr1, arr2, cnt);
        for (String s : solution) {
            System.out.println(s);
        }

    }
}
