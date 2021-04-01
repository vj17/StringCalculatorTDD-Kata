package com.package1;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class StringCalculator {


    public int Add(String numbers) {

        String delimiter=null;

        if(numbers.equals(""))
            return 0;

        if(numbers.contains("//")) {
            delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        String[] numbersArray = numbers.split("(,|\\n|"+delimiter+")");

        int sum = 0;

        for(String s: numbersArray)
            sum += Integer.parseInt(s);

        return sum;
    }
}
