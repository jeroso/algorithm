package programmers.완전탐색.소수찾기;

import java.util.Set;

// 재귀함수 => 숫자의 모든 조합을 만든후 소수의 개수를 리턴
// 같은숫자가 2개인 경우 같은 숫자조합이 발생하므로 Set을 사용하여 중복을 없앤다.
// 소수 찾기 =>  애라토스테네스 체 활용 : 특정 숫자의 제곱근까지의 약수 여부를 검증하면 된다.

public class Solution {
    public int solution(String numbers) {


        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("17"));
    }
}
