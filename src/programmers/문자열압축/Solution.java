package programmers.문자열압축;

public class Solution {
    public int solution(String s) {
        int min = s.length();

        for (int i = 0; i <s.length() /2; i++) {
            int compLeng = compression(s, i).length();
        }
        int answer = 0;
        return answer;
    }

    /**
     * 문자열 압축
     * @param s 입력받은 문자열
     * @param i i번째 값
     * @return 압축된 문자열
     */
    private String compression(String s, int i) {
        int count = 1;
        String compression = "";

        return compression;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("aabbaccc"));
    }
}
