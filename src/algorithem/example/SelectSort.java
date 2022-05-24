package algorithem.example;

import java.util.ArrayList;
import java.util.Collections;

public class SelectSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lower;
        for (int i = 0; i < dataList.size() - 1; i++) {
            lower = i;
            for (int j = i + 1; j < dataList.size(); j++) { // loof 가 한번 돌때마다 정렬 완료 됨
                if (dataList.get(lower) > dataList.get(j)) {
                    lower = j;
                }
                Collections.swap(dataList, lower, i);
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        SelectSort ss = new SelectSort();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }
        ArrayList<Integer> result = ss.sort(testData);
        for (Integer integer : result) {
            System.out.println("integer = " + integer);
        }
    }
}
