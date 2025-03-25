package practice.inflearn.문자열;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어뒤집기_04 {


    public void solution(List<String> list) {
        List<String> answer = new ArrayList<>();

        //1. StringBuilder() 사용
        /**
        for (int i = 0; i < list.size(); i++) {
            answer.add(new StringBuilder(list.get(i)).reverse().toString());
        }

        for (String str :answer) {
            System.out.println(str);
        }
        **/
        //2. 직접 뒤집기
        for (String str : list) {
            char[] ch = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                char temp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = temp;
                lt++;
                rt--;
            }
            String s = String.valueOf(ch);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        단어뒤집기_04 main = new 단어뒤집기_04();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            list.add(sc.next());
        }
        main.solution(list);
    }


}
