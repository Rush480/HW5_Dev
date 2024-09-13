package com.app;

public class FibbonaciRecursive {

    public static long fibbonaciRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibbonaciRec(n - 1) + fibbonaciRec(n - 2);
    }
}
