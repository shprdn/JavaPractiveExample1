package com.stackroute.junitdemo;
import java.lang.System;
import java.util.Scanner;

public class SeriesFormation {

    public String pattern(int num) {
        int i, a=0,j, k=0;
        String s ="";
        if (num==0)
            return "invalid";

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                k = i;
                s = s + k;
            }
        }
        return s;
    }
}