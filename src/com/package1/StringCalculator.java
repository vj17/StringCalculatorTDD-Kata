package com.package1;

public class StringCalculator {


    public int Add(String numbers) {

        if (numbers.equals(""))
            return 0;

        String delimiter = null;

        if (numbers.contains("//")) {
            delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
        }

        String[] numbersArray = extractNumbers(numbers, delimiter);

        return calculateSum(numbersArray);
    }

    private String[] extractNumbers(String numbers, String delimiter) {
        return numbers.split("(,|\\n|" + delimiter + ")");
    }

    private int calculateSum(String[] numbersArray) {
        int sum = 0;

        for (String s : numbersArray)
            sum += Integer.parseInt(s);

        return sum;
    }
}
