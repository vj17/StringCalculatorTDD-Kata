package com.package1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringCalculator calculator = new StringCalculator();
        calculator.Add("1,2");
        calculator.Add("34,56,1");
        calculator.Add("2\n4");
        calculator.Add("//;\n1;4;6;7;9");
        System.out.println(calculator.GetCalledCount());
    }
}
