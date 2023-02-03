package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed = 0;
        while(number != 0) {
            // get last digit from num
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            number /= 10;
        }
        System.out.println(reversed);
    }
}
