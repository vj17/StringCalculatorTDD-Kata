package com.package1;

import java.util.ArrayList;
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
        ArrayList negativeNumbers = new ArrayList();

        for (String s : numbersArray) {
            int num = Integer.parseInt(s);

            if (num < 0)
                negativeNumbers.add(num);

            else
                sum += num;
        }

        if (negativeNumbers.size() > 0)
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);

        return sum;
    }
}
