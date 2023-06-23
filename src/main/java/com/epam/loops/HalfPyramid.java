package com.epam.loops;

public class HalfPyramid extends Object {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(5);
    }

}
