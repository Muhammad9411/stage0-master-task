package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String text = "";
            String space = "";
            for (int j = i; j >= 1; j--) {
                text += "" + j;
            }
            for (int k = 2; k <= i; k++) {
                text += "" + k;
            }
            for (int m = cathetusLength - i; m >= 1; m--) {
                space += " ";
            }
            System.out.println(space + text);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
