package practice.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/250137
public class 붕대감기 {

    //내가 푼 방식
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int h = health;
        int cnt = 0;
        int idx = 0;
        for (int i = 1; i <= attacks[attacks.length-1][0]; i++) {
                if (attacks[idx][0] == i) {
                    cnt = 0;
                    h -= attacks[idx][1];
                    idx++;
                    if(h <= 0) return -1;
                } else {
                    h += bandage[1];
                    cnt++;
                    if (cnt == bandage[0]) {
                        h += bandage[2];
                        cnt = 0;
                    }
                    if(h > health) h = health;
                }
        }
        answer = h;

        return answer;
    }

    //다른 사람 풀이
    public int solution2(int[] bandage, int health, int[][] attacks) {
        int cnt = bandage[0]; // 추가 체력 기준
        int now = health; // 현재 체력
        int std = 0; // 마지막으로 공격당한 시간

        int v1, v2; // 추가 체력 받을 수 있나?
        for (int[] atk: attacks) {
            if (now <= 0) {
                return -1;
            }

            v1 = atk[0] - std - 1; // 시간 차이
            v2 = v1 / cnt; // 추가 체력 회수

            // 맞기 직전까지의 체력 정산
            std = atk[0];
            now = Math.min(health, now + (v1 * bandage[1]));
            now = Math.min(health, now + (v2 * bandage[2]));

            now -= atk[1];
        }

        return now <= 0 ? -1 : now;
    }

    public static void main(String[] args) {
        붕대감기 main = new 붕대감기();
        //5초 연속이면 추가 보상 5, 초마다 1++
        int[] bandage = {5, 1, 5};
//        int[] bandage = {3, 2, 7};
//        int[] bandage = {4, 2, 7};
//        int[] bandage = {1, 1, 1};
        int health = 30;
//        int health = 20;
//        int health = 5;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
//        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
//        int[][] attacks = {{1, 2}, {3, 2}};
        int solution = main.solution(bandage, health, attacks);
        System.out.println(solution);
    }
}
