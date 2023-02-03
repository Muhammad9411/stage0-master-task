package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int summary = 0;
        while (number != 0) {
            int digit = number % 10;
            summary += digit;
            number /= 10;
        }
        System.out.println(summary);
    }

}
