package practice.inflearn.문자열;

import java.util.Scanner;

public class 가장짧은_문자거리_10 {

    public int[] solution(String str, char target) {
        //teachermode e
        // 왼쪽 순회 > 거리값을 100으로 두고 e 가 나오면 0으로 초기화 하고 e가 아니면 +1
        // 오른쪽 순회 > 같은 방식으로 넣되 +1 한 값과 기존값을 비교하여 작은값
        int[] answer = new int[str.length()];
        char[] charArray = str.toCharArray();
        int p = 1000;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == target) {
                p = 0;
                answer[i] = p;
            } else {
                answer[i] = ++p;
            }
        }
        p = 1000;
        for (int j = charArray.length - 1; j >= 0; j--) {
            if(charArray[j] == target) {
               p = 0;
               answer[j] = p;
            } else {
                answer[j] = Integer.min(answer[j], ++p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가장짧은_문자거리_10 main = new 가장짧은_문자거리_10();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int[] solution = main.solution(s, c);
        for (int i : solution) {
            System.out.print(i + " ");
        }

    }
}
