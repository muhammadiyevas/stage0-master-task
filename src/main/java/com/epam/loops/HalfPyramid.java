package com.epam.loops;

import java.util.Collections;

public class HalfPyramid extends Object {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 2 * (cathetusLength - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
