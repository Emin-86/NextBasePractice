package com.cybertek.runners;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Fibonacci(12));
    }


    public static String Fibonacci(int number) {
        int[] fib = new int[number + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return Arrays.toString(fib);
    }
}