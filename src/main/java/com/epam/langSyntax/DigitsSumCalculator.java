package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum=0;
        int tempNumber = number;

        while ( tempNumber>0){
            sum+=tempNumber%10;
            tempNumber/=10;
        }

        System.out.println(sum);
    }

}
