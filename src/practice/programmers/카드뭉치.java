package practice.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class 카드뭉치 {
    //내가 푼 방법
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int t1 =0, t2 =0;
        for (int i = 0; i < goal.length; i++) {
            if (t1 < cards1.length && goal[i].equals(cards1[t1])) {
                t1++;
            }  else if(t2 < cards2.length && goal[i].equals(cards2[t2])){
                t2++;
            } else {
                return "No";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        카드뭉치 main = new 카드뭉치();
        String[] cards1 = {"i", "drink", "water"};
//        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
//        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
//        String[] goal = {"i", "want", "to", "drink", "water"};
        String solution = main.solution(cards1, cards2, goal);
        System.out.println(solution);
    }
}
