package practice.etc;

import java.util.Scanner;

public class grip {

    public String solution(int price) {
        //input 1000
        //output "1,000"
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] str = String.valueOf(price).toCharArray();
        int cnt = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            cnt++;
            if(cnt % 3 == 0) sb.append(",");
        }
        answer = sb.reverse().toString();

        return answer;

    }

    public static void main(String[] args) {
        grip grip = new grip();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String solution = grip.solution(i);
        System.out.println(solution);
    }
}
