package com.package1;

public class StringCalculator {


    public int Add(String numbers) {

        if(numbers.equals(""))
            return 0;

        if(!numbers.contains(","))
            return Integer.parseInt(numbers);

        String[] numbersArray = numbers.split(",");

        int sum = 0;

        for(String s: numbersArray)
            sum += Integer.parseInt(s);

        return sum;
    }
}
