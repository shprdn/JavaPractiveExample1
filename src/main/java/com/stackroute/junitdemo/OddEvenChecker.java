package com.stackroute.junitdemo;

public class OddEvenChecker {
    public String check(int num) {
        if (num % 2 == 0 && (num > 20 || num < 30))
            return "Jerry";
        else if (num % 2 == 1 && (num > 20 || num < 30))
            return "Tom";
        else
            return "invalid";

    }
}