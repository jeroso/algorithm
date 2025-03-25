package Inflearn.Section00;
import java.util.Scanner;

public class Main_01_01 {
    public int solution(String input1, char input2){
        int answer = 0;
        String lower = input1.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            if(lower.charAt(i) == Character.toLowerCase(input2)) answer ++;
        }
        return answer;
    }
    public static void main(String[] args){
        Main_01_01 main = new Main_01_01();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        int result = main.solution(input1, input2.charAt(0));
        System.out.println("result : " + result);
    }
}
