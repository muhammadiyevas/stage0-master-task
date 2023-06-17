package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 1; i <= 10; i++) {

            int result = numberTableToPrint * i;

            System.out.println(numberTableToPrint + " x " + i + " = " + result+"\n");
        }
    }

}
