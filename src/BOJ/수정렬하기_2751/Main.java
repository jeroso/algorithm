package BOJ.수정렬하기_2751;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(temp);
        while(temp > 0) {
            arr.add(sc.nextInt());
            temp--;
        }
        Collections.sort(arr);
        System.out.println("arr = " + arr);
    }
}
