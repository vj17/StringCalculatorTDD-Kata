package com.package1;

import java.util.ArrayList;

public class StringCalculator {

    private int count = 0;

    public int Add(String numbers) {

        // to keep track of the number of times the Add method was called
        count++;

        // if the string is empty, return 0
        if (numbers.equals(""))
            return 0;

        // return sum
        return calculateSum(extractNumbers(numbers));
    }

    // method to get the count of the number of times, Add was called
    public int GetCalledCount() {
        return count;
    }

    // method to separate the numbers from the delimiters, "," and "\n"
    private String[] extractNumbers(String numbers) {

        String delimiter = null;

        if (numbers.contains("//")) {
            delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        return numbers.split("(,|\\n|" + delimiter + ")");
    }

    // method to compute the sum of numbers after they are extracted
    private int calculateSum(String[] numbersArray) {
        int sum = 0;

        // to store the negative numbers in the array
        ArrayList negativeNumbers = new ArrayList();

        // add positive numbers, store the negative numbers in the array list
        for (String s : numbersArray) {
            int num = Integer.parseInt(s);

            if (num < 0)
                negativeNumbers.add(num);

            else
                sum += num;
        }

        // throw an exception if there are negative numbers
        if (negativeNumbers.size() > 0)
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);

        return sum;
    }
}
