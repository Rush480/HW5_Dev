package com.app;

public class Demo {

    public static void main(String[] args) {
        var fibRecursive = new FibbonaciRecursive();
        var fibLinear = new FibbonaciLinear();
        var fibDP = new FibbonaciDP();

        System.out.println("Fibbonaci Recursive: " + fibRecursive.fibbonaciRec(5));
        System.out.println("Fibbonaci Linear: " + fibLinear.fibbonaciLinear(5));
        System.out.println("Fibbonaci Dinamic Programming: " + fibDP.fibbonaciDP(5));
    }
}
