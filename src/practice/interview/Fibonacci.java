package practice.interview;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int fibo(int n) {
        if(n <= 1) return n;
        if(memo.containsKey(n)) return memo.get(n);

        int result = fibo(n - 1) + fibo(n - 2);
        memo.put(n, result);
        return result;
    }
}
