package com.stackroute.junitdemo;

import java.util.Scanner;

public class PalindromeChecker {
        public String check ( int num){

            int i, rem, sum = 0, total = 0;
            int temp;
            temp = num;
            while (num > 0) {
                rem = num % 10;
                if (rem % 2 == 0)
                    total = total + rem;
                sum = (sum * 10) + rem;
                num = num / 10;
            }
            if (temp == sum) {
                if (total > 25)
                    return(temp + " is palindrome and the sum of even numbers is greater than 25");
                else
                    return(temp + " is palindrome and the sum of even numbers is less than 25");

            } else
                return(temp + " is not pallindrome");
        }
    }