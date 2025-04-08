package practice.programmers.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class 개인정보수집_유효기간 {
    //내가 푼 방법
    public LocalDate toDate(String date, int month) {
        DateTimeFormatter formatter = getDateTimeFormatter();
        LocalDate localDate = LocalDate.parse(date, formatter).plusMonths(month).minusDays(1);
        if(localDate.getDayOfMonth() > 28) localDate = localDate.withDayOfMonth(28);
        return localDate;
    }

    private static DateTimeFormatter getDateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return formatter;
    }

    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        DateTimeFormatter dateTimeFormatter = getDateTimeFormatter();
        LocalDate day = LocalDate.parse(today, dateTimeFormatter);
        System.out.println(day);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] split = terms[i].split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            Integer n = map.get(split[1]);
            LocalDate date = toDate(split[0], n);
            if (day.isAfter(date)) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    //다른 사람 풀이
    public int[] solution2(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        int date = getDate(today);

        for (String s : terms) {
            String[] term = s.split(" ");

            termMap.put(term[0], Integer.parseInt(term[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(integer -> integer).toArray();
    }

    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }


    public static void main(String[] args) {
        개인정보수집_유효기간 main = new 개인정보수집_유효기간();
//        String today = "2022.05.19";
        String today = "2020.01.01";
//        String[] terms = {"A 6", "B 12", "C 3"};
        String[] terms = {"Z 3", "D 5"};
//        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        List<Integer> solution = main.solution(today, terms, privacies);
        for (int n : solution) {
            System.out.print(n + " ");
        }
    }
}
