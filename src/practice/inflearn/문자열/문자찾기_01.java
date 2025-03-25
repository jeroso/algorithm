package practice.inflearn.문자열;

import java.util.List;
import java.util.Scanner;

public class 문자찾기_01 {

    public int solution(String str, char c) {
        int answer = 0;
        String st = str.toLowerCase();
        char ch = Character.toLowerCase(c);

//        for(int i : st.toCharArray()) // toCharArray()를 사용하여 배열로 만들어서 사용 가능
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == ch) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        문자찾기_01 main = new 문자찾기_01();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(main.solution(str, c));

    }
}
