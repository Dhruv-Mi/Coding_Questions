package com.company;

import java.util.Scanner;

public class Number_of_days_between_two_dates {
    static int[] daysPerMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public static int daysBetweenDates(String date1,String date2){
        return Math.abs(daysFrom1971(date1)- daysFrom1971(date2));
    }
    public static int daysFrom1971(String date) {

        String[] dateArray = date.split("-");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);

        int yearsFrom1971 = year - 1971;

        boolean isLeap = (year%4==0 &&(year % 100 != 0 || year %400 == 0));

        if(month>2 && isLeap) day++;

        for(int m = 1; m < month;m++)
            day+=daysPerMonth[m-1];

        return day + yearsFrom1971*365 + countLeapYears(year);
    }
    public static int countLeapYears(int year) {
        int count = 0;
        for(int y = 1971; y < year; y++) {
            if(y%4==0 &&(y % 100 != 0 || y %400 == 0))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date1= sc.next();
        String date2= sc.next();
        int ans=daysBetweenDates(date1,date2);
        System.out.println(ans);
    }
}
