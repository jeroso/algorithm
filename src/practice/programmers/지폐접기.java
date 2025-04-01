package practice.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/340199
public class 지폐접기 {
    // 내가 푼 방식
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int max = Math.max(wallet[0], wallet[1]);
        int min = Math.min(wallet[0], wallet[1]);
        int maxBill = Math.max(bill[0], bill[1]);
        int minBill = Math.min(bill[0], bill[1]);

       while (maxBill > max || minBill > min){
           if (maxBill / 2 < minBill) {
               int temp = minBill;
               minBill = maxBill / 2;
               maxBill = temp;
           } else {
               maxBill = maxBill / 2;
           }
           answer++;
       }
        return answer;
    }

    //다른 사람 풀이
    public int solution2(int[] wallet, int[] bill) {
        int answer = 0;
        while(max(wallet) < max(bill) || min(wallet) < min(bill)) {
            bill[bill[0] > bill[1] ? 0 : 1] /= 2;
            answer++;
        }
        return answer;
    }

    private int max(int[] arr) {
        return Math.max(arr[0], arr[1]);
    }

    private int min(int[] arr) {
        return Math.min(arr[0], arr[1]);
    }
    public static void main(String[] args) {
        지폐접기 main = new 지폐접기();
//        int[] wallet = {30, 15};
        int[] wallet = {50, 50};
//        int[] bill = {26, 17};
        int[] bill = {100, 241};
        int solution = main.solution(wallet, bill);
        System.out.println(solution);
    }
}
