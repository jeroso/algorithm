package practice.programmers.level1;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class 햄버거만들기 {

    public int solution(int[] ingredient) {
        int answer = 0;
        //1231 순서
        List<Integer> list = new LinkedList<>();
        for (int i : ingredient) {
            list.add(i);
            if (list.size() >= 4) {
                if (list.get(list.size() - 4) == 1
                        && list.get(list.size() - 3) == 2
                        && list.get(list.size() - 2) == 3
                        && list.get(list.size() - 1) == 1) {
                    answer++;
                    list.remove(list.size() - 4);
                    list.remove(list.size() - 3);
                    list.remove(list.size() - 2);
                    list.remove(list.size() - 1);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        햄버거만들기 main = new 햄버거만들기();
        int case1 = main.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        int case2 = main.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
        System.out.println(case1);
        System.out.println(case2);
    }
}
