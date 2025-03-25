package practice.inflearn.문자열;

import java.util.Scanner;

public class 문장속단어_03 {

    public String solution(String str) {
        String answer = "";
        // it is time to study
        String[] strings = str.split(" ");
        int size = 0;
        for (String s : strings) {
            if(s.length() > size){
                answer = s;
                size = s.length();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문장속단어_03 main = new 문장속단어_03();
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String solution = main.solution(next);
        System.out.println(solution);
    }
}
