package algorithem.example;

import java.util.ArrayList;
import java.util.Collections;

public class InsertSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (dataList.get(j) < dataList.get(j - 1)) {
                    Collections.swap(dataList, j, j - 1);
                }else{
                    break;
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testList.add((int) (Math.random() * 100));
        }
        is.sort(testList);
        for (Integer integer : testList) {
            System.out.println("integer = " + integer);
        }
    }
}
