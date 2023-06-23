package com.epam.OOP;

public class Dog extends Animal {
    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly brown. It has 4 paws and a fur.";
    }
}
