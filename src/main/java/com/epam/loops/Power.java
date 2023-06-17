package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int result = (int) Math.pow(numberToPrint, power);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
