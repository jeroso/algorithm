package programmers.전화번호목록;

import java.util.HashMap;
import java.util.Vector;

public class Main {


    static String[] phone_book = {"22", "97674223", "1195524421"};

    static HashMap<String, String> hm = new HashMap<>();

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String input : phone_book) {
            hm.put(input, input);
        }
        System.out.println(hm);
        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hm.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {
        System.out.println(solution(phone_book));

    }
}
