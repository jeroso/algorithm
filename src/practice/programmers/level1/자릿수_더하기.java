package practice.programmers.level1;

public class 자릿수_더하기 {

    public int sum(int n) {
        if(n == 0) return 0;
        return n % 10 + sum(n / 10);
    }

    public int solution(int n) {
        int answer = 0;
//        while (n > 0) {
//            answer += n % 10;
//            n /= 10;
//        }
        answer = sum(n);
        System.out.println("Hello Java : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        자릿수_더하기 main = new 자릿수_더하기();
        main.solution(123);
    }
}
