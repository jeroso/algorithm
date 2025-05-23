package practice.inflearn.practice.문자열;

public class 팰린드룸_08 {

    public String solution(String str) {
        String answer = "YES";
        String replaced = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(replaced).reverse().toString();
        if(!replaced.equals(reversed)) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        팰린드룸_08 main = new 팰린드룸_08();
        main.solution("abcd");
    }
}
