package com.app;

public class FibbonaciLinear {

    public static long fibbonaciLinear(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
}
