package practice.programmers.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class 크기가작은_부분문자열 {
    //내가 푼 방식
    //제한 사항 1 ≤ p의 길이 ≤ 18 이 조건으로 인해 Integer.parseInt() 는 런타임 에러가 발생함
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long n = Long.parseLong(p);
        for (int i = 0; i < (t.length() - length) + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + length));
            if(diff <= n) answer++;
        }
        return answer;
    }
    // 다른 사람이 푼 방식

    public static void main(String[] args) {
        크기가작은_부분문자열 main = new 크기가작은_부분문자열();
//        String t = "3141592";
//        String t = "500220839878";
        String t = "10203";
//        String p = "271";
//        String p = "7";
        String p = "15";
        int solution = main.solution(t, p);
        System.out.println(solution);
    }
}
