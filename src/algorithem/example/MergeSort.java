package algorithem.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public ArrayList<Integer> splitFunc(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) return dataList;

        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = new ArrayList<>(dataList.subList(0, medium));

        rightArr = new ArrayList<>(dataList.subList(medium, dataList.size()));

//        System.out.println(leftArr);
//        System.out.println(rightArr);
        return this.mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        int leftPoint = 0;
        int rightPoint = 0;

        // CASE 1 : left, right 둘 다 있을 때
        while (leftList.size() > leftPoint && rightList.get(rightPoint) > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            }else{
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        // CASE2: right 데이터가 없을 때
        while (leftList.size() > leftPoint) {

            mergedList.add(leftList.get(leftPoint));

            leftPoint += 1;

        }

        // CASE3: left 데이터가 없을 때
        while (rightList.size() > rightPoint) {

            mergedList.add(rightList.get(rightPoint));

            rightPoint += 1;

        }
        return mergedList;
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ArrayList<Integer> integers = ms.splitFunc(new ArrayList<Integer>(Arrays.asList(4, 1, 2, 3, 5, 7, 9)));
    }
}
