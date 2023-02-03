package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        String result = "This animal is mostly " + color +
                ".It has " + numberOfPaws + (numberOfPaws == 1 ? " paw " : " paws ") + "and " + (hasFur ? "a " : "no ") + "fur. " +
                "Moreover, it has 2 wings and can fly.";
        return result;
    }
}
