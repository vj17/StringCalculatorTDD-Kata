package com.package1;

import java.util.Arrays;

public class StringCalculator {

    public int Add(String numbers) {

        if (numbers.equals(""))
            return 0;

        return calculateSum(extractNumbers(numbers));
    }

    private String[] extractNumbers(String numbers) {

        String delimiter = null;

        if (numbers.contains("//")) {
            delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        return numbers.split("(,|\\n|" + delimiter + ")");
    }

    private int calculateSum(String[] numbersArray) {
        int sum = 0;

        for (String s : numbersArray) {
            int num = Integer.parseInt(s);
            
            if (num < 0)
                throw new IllegalArgumentException("Negatives not allowed: " + num);

            sum += num;
        }
        return sum;
    }
}
