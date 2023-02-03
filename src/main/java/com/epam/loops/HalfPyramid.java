package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String text = "";
            String space = "";
            for (int j = i; j >= 1; j--) {
                text += "*";
            }
            for (int m = cathetusLength - i; m >= 1; m--) {
                space += " ";
            }
            System.out.println(space + text);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
