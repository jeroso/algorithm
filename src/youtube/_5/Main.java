package youtube._5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// 대문자 <=> 소문
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr;
        arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                Character.toUpperCase(arr[i]);
            }else{
                Character.toLowerCase(arr[i]);
            }
        }
        System.out.println("arr = " + arr);
    }

}



