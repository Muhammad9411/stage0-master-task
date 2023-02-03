package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int r = 1;
        for (int i = 1; i <= power; i++) {
            r = r * numberToPrint;
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        new Power().printPower(1, 200);
    }

}
