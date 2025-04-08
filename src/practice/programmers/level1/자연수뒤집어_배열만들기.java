package practice.programmers.level1;

public class 자연수뒤집어_배열만들기 {
    //내가 푼 방식
    public int[] solution(long n) {
        String s = "" + n;
        int[] answer = new int[s.length()];
        int cnt=0;

        while(n > 0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;

    }
    //다른 사람이 푼 방식
    public int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {
        자연수뒤집어_배열만들기 main = new 자연수뒤집어_배열만들기();
        int[] solution = main.solution(12345);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
