package programmers.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> participant = Arrays.asList("leo", "kiki", "eden");
        List<String> completion = Arrays.asList("eden", "kiki");

        System.out.println(Solution(participant, completion));
    }

    public static List<String> Solution(List<String> participant, List<String> completion) {
        List<String> res = participant.stream()
                .sorted()
                        .filter(list -> completion.stream().sorted().noneMatch(Predicate.isEqual(list)))
                                .collect(Collectors.toList());
        return res;
    }
}
