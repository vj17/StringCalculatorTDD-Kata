package com.package1;

public class StringCalculator {
    public int Add(String numbers) {

        if(numbers.equals(""))
            return 0;

        if(!numbers.contains(","))
            return Integer.parseInt(numbers);

        String first = numbers.substring(0,1);
        String second = numbers.substring(2);

        int sum = Integer.parseInt(first) + Integer.parseInt(second);
        return sum;

    }
}
