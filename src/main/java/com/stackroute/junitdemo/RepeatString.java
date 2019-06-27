package com.stackroute.junitdemo;

public class RepeatString {

    public String repeat(String name,int num) {
        char[] c = name.toCharArray();
        int len= name.length();
        for (int i = 0; i < num; i++) {
             return name + name.substring(c.length - num);
        }
        return "invalid";
    }
}