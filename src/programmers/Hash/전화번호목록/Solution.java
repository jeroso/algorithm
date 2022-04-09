package programmers.Hash.전화번호목록;

import java.util.Arrays;
import java.util.HashMap;

// 1. Loop 만 사용 => 시간낭비
// 2. Sorting / Loop 을 활용
// 3. Hash를 활용
public class Solution {
    public boolean solution(String[] phone_book) {
        //2번으로 풀이
/*
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) // 총 3개라고 가정할때 마지막 번호는 비교할 필요 X
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;

        return true;
*/
// 3번 Hash 풀이 => substring을 이용하여 1195524421 의 0~3 번째 수가 119 이므로 key값중 "119" 값이 있기 때문에 접두어 존재
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], 1);
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
    return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674233", "1195524421"};
        Solution sol = new Solution();
        System.out.println(sol.solution(phone_book));
    }
}
