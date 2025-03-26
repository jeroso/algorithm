package practice.interview;

import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() -1; i++) {
            boolean swap = false;
            for (int j = 0; j < list.size() -1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swap = true;
                }
            }
        if(!swap) break;
        }
        return list;
    }
}
