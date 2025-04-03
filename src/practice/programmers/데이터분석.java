package practice.programmers;

import java.util.*;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/250121
public class 데이터분석 {
    //내가 푼 방식
    public List<List<Integer>> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<List<Integer>> answer = new ArrayList<>(new ArrayList<>());
        Map<String, Integer> maps = Map.of(
                "code", 0,
                "date", 1,
                "maximum", 2,
                "remain", 3
        );
        List<List<Integer>> collect = Arrays.stream(data)
                .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());

            for (int i = 0; i < data.length; i++) {
                if (data[i][maps.get(ext)] < val_ext) {
                    answer.add(Arrays.stream(data[i]).boxed().collect(Collectors.toList()));
                }
            }
            answer.sort(Comparator.comparing(row -> row.get(maps.get(sort_by))));
        return answer;
    }

    //좀 더 간단한 다른사람 풀이
    public int[][] solution2(int[][] data, String ext, int val_ext, String sort_by) {

        String[] arr = {"code","date","maximum","remain"};
        List<String> columnList = Arrays.asList(arr);
        int extIdx = columnList.indexOf(ext);
        int sortIdx = columnList.indexOf(sort_by);
        int[][] answer = Arrays.stream(data).filter(o1 -> o1[extIdx] < val_ext)
                .sorted((o1 ,o2) -> o1[sortIdx]-o2[sortIdx]).toArray(int[][]::new);

        return answer;
    }

    public static void main(String[] args) {
        데이터분석 main = new 데이터분석();
        //ext, sort_by => "code", "date", "maximum", "remain"
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        List<List<Integer>> solution = main.solution(data, ext, val_ext, sort_by);

    }
}
