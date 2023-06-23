package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        // Check if the month is valid (between 1 and 12)
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        // Check if it's a leap year
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Calculate the number of days in the given month
        int daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }

        // Print the result
        System.out.println(daysInMonth);
    }
}


