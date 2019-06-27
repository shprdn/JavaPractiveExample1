package com.stackroute.junitdemo;

public class ReverseString {
    public String check(String str) {
        String reverse = "";
        int i;
        if (str==null)
            return "null not allowed";
        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}