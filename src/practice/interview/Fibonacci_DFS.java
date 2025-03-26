package practice.interview;

public class Fibonacci_DFS {
    static int[] memo = new int[46];

    public static void main(String[] args) {

        for (int i = 0; i <= 45; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (memo[n] != 0) return memo[n];
        if (n == 0) return memo[n] = 0;
        if (n == 1) return memo[n] = 1;
        return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
