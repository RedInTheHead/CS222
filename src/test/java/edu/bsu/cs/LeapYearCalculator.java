package edu.bsu.cs;

public class LeapYearCalculator {
    public boolean isLeapYear(int year){
        if (year % 4 == 0)
            return true;
        return false;

    }
}
