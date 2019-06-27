package com.stackroute.junitdemo;

import java.util.Scanner;

public class VowelConsonent {
    public String  check(String str) {
        String st = "";
        if (str==null) {
            return "null not allowed";
        }
        int i;
        int len;
        len = str.length();
        for (i = 0; i < len; i++) {
            if (str.charAt(i) == 'A'|| str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'U' || str.charAt(i) == 'u')
                st= st+ " vowel";
            else
                st= st+  " consonent";
        }
                return st;
    }
}