package com.package1;

public class StringCalculator {
    public int Add(String numbers) {

        if(numbers.equals(""))
            return 0;

        return Integer.parseInt(numbers);
    }
}
