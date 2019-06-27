package com.stackroute.junitdemo;

import javax.naming.InterruptedNamingException;

public class IndefiniteSum {
    public String summation(String[] num)

    {
        int total = 0;
        int i;
        try {
            for (i=0;i<num.length;i++) {

                    if (Integer.parseInt(num[i]) == 0) {
                        break;
                    }
                    total += Integer.parseInt(num[i]);
            }


        }
        catch (Exception e) {
            return  "error";
        }
        String st = Integer.toString(total);
        return st;
    }
}
