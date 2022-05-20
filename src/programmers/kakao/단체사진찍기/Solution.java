package programmers.kakao.단체사진찍기;

public class Solution {
    public int solution(int n, String[] data) {
        int answer = 0;
        // 조건의 개수 n;
        // 조건 데이터 배열 data

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2;
        // {A, C, F, J, M, N, R, T} 총 8명
        //{"N~F=0", "R~T>2"} => N은 F와 붙어야 하고, R은 T와 간격이 2 이상
        String[] data = {"N~F=0", "R~T>2"};
        int solution = sol.solution(n, data);
        System.out.println("solution = " + solution);
    }
}
