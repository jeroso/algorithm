package practice.interview;

import java.util.List;

public class SelectSort {

    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int lower = i;
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(lower) > list.get(j)) {
                    lower = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(lower));
            list.set(lower, temp);
        }
        return list;
    }
}
