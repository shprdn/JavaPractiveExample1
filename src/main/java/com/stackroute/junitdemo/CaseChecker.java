package com.stackroute.junitdemo;

import java.util.Scanner;
import java.io.*;

public class CaseChecker
{
        public String check(String str)
        {
            char ch = str.charAt(0);
            if(ch>=48 && ch<58)
            return "digit";
            else if(ch>=97 && ch<123)
            return "small letter";
            else if(ch>=65 && ch<91)
            return  "capital letter";
            else
            return "special character";


    }
}

