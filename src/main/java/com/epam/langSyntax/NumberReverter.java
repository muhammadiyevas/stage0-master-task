package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversedNumber=0;
        int reversed;

        while (number!=0){
            reversed =number % 10;
            reversedNumber =reversedNumber *10+reversed;
            number /=10;
        }

        System.out.println(reversedNumber);

    }

}
