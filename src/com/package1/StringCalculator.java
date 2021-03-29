package com.package1;

public class StringCalculator {
    public int Add(String numbers) {

        if(numbers.equals(""))
            return 0;

        if(!numbers.contains(","))
            return Integer.parseInt(numbers);

        if(hasMoreThanTwoNumbers(numbers))
            return -1;

        int indexOfComma = numbers.indexOf(",");

        String first = numbers.substring(0, indexOfComma);
        String second = numbers.substring(indexOfComma + 1);

        int sum = Integer.parseInt(first) + Integer.parseInt(second);

        return sum;

    }

    private boolean hasMoreThanTwoNumbers(String numbers) {
        int count = 0;

        for(int i = 0; i < numbers.length(); i++) {
            if(numbers.charAt(i) == ',')
                count++;
        }

        return count > 1;
    }
}
