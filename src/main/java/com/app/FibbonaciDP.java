package com.app;

import java.util.HashMap;
import java.util.Map;

public class FibbonaciDP {

   private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibbonaciDP(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = fibbonaciDP(n - 1) + fibbonaciDP(n - 2);
        memo.put(n, fib);
        return fib;
    }
}
