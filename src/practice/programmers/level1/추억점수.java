package practice.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 추억점수 {
    //내가 푼 방법
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    sum += map.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
    //다른사람 풀이
    public int[] solution2(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = IntStream.range(0, name.length).mapToObj(operand -> Map.entry(name[operand], yearning[operand])).collect(Collectors.toSet()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
    }
    public static void main(String[] args) {
        추억점수 main = new 추억점수();
//        String[] name = {"may", "kein", "kain", "radi"};
        String[] name = {"may", "kein", "kain", "radi"};
//        int[] yearning = {5, 10, 1, 3};
        int[] yearning = {5, 10, 1, 3};
//        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
        int[] solution = main.solution(name, yearning, photo);
        for (int n : solution) {
            System.out.print(n + " ");
        }
    }
}
