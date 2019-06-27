package com.stackroute.junitdemo;

import java.util.Scanner;

public class IntegerChecker {
    public String guessNum(int num) {
        if (num > 1 && num < 100) {
            return("Number guessed matches the original number");
        } else if (num <= 1) {
            return("Number guessed is less than original number");
        } else {
            return ("Number guessed is more than original number");
        }
    }
}