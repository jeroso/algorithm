package BOJ._10828_스택;

import java.util.Scanner;
import java.util.Stack;

//스택
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            switch (arr[0]) {
                case "push":
                    stack.push(Integer.parseInt(arr[1]));

                case "top":
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                case "size":
                    System.out.println(stack.size());
                case "empty":
                    if (stack.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                case "pop":
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
            }

        }
    }
}
