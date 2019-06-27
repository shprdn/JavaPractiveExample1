package com.stackroute.junitdemo;

public class IntegerSort {

        public String sort(int n) {
            int result = 0, sum = 0;
            int[] freq = new int[10];
            String st = "";
            String stt ="";
            while (n > 0) {
                int d = n % 10;
                freq[d]++;
                n = n / 10;
                if(d%2==0)
                    sum = sum +d;
            }

            for (int i = 9; i >= 0; i--) {
                if (freq[i] != 0) {
                    result = i;
                    freq[i]--;
                    break;
                }
            }
            for (int i = 9; i >= 0; i--)
                while (freq[i]-- != 0) {
                    result = result * 10 + i;

                }
            stt = stt +result;
            st=st+sum;


            if (sum > 15) {
                return stt + " " + st + " false";

            }
            else
            {
                return stt + " " + st;

            }

        }
}
