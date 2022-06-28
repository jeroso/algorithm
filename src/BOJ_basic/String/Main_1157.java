package BOJ_basic.String;


import java.util.Scanner;


//단어공부
public class Main_1157 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[26];    //알파벳 개수 26
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { //아스키코드 'A': 65, 'a': 97
                ans[s.charAt(i) - 'A']++;
            }else{
                ans[s.charAt(i) - 'a']++;
            }
        }
        int max = Integer.MIN_VALUE;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (ans[i] > max) {
                max = ans[i];
                ch = (char) (i + 65);
            } else if (ans[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
