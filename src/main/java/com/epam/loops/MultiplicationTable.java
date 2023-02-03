package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + i * numberTableToPrint);
        }
    }

}
