package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Day_of_the_week {
    public static String dayOfTheWeek(int day,int month,int year){
        LocalDate local=LocalDate.of(year,month,day);
        DayOfWeek ans=DayOfWeek.from(local);
        String result= ans.name();
        return result.charAt(0)+result.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day= sc.nextInt();
        int month= sc.nextInt();
        int year= sc.nextInt();
        String ans=dayOfTheWeek(day,month,year);
        System.out.println(ans);
    }
}
