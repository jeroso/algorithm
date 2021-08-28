package youtube._3;


import java.util.Arrays;
import java.util.Scanner;

//최빈값
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int[] result = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
            result[input[i]]++;
        }
        int idx = Arrays.binarySearch(result, Arrays.stream(result).max().getAsInt());
        System.out.println(Arrays.stream(result).max());
        for (int i = 0; i < result.length; i++) {
            int i1 = result[i];
            System.out.println("i" + i + " = " + i1);
        }
        System.out.println("idx = " + idx);

    }
}


