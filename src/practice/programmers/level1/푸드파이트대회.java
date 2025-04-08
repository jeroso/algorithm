package practice.programmers.level1;


//https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class 푸드파이트대회 {
    // 내가 푼 방식
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        answer += sb;
        answer += 0;
        answer += sb.reverse();
        return answer;
    }
    // 다른 사람이 푼 방식
    public String solution2(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        푸드파이트대회 main = new 푸드파이트대회();
        String case1 = main.solution(new int[]{1, 3, 4, 6});
        String case2 = main.solution(new int[]{1, 7, 1, 2});
        System.out.println(case1);
        System.out.println(case2);
    }
}
