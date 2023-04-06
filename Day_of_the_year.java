package com.company;

import java.util.Scanner;

public class Day_of_the_year {
    public static int dayOfYear(String date){
        int month=Integer.parseInt(date.substring(5,7));
        int day= Integer.parseInt(date.substring(8));
        int year=Integer.parseInt(date.substring(0,4));
        int value=1;
        int ans=0;
        while(value<month){
            if(value==2){
                if(year%4==0 && year!=1900) {
                    ans = ans + 29;
                }
                else{
                    ans=ans+28;
                }
            }
            else if(value<8){
                if(value%2==0){
                    ans=ans+30;
                }
                else{
                    ans=ans+31;
                }
            }
            else{
                if(value%2==0){
                    ans=ans+31;
                }
                else{
                    ans=ans+30;
                }
            }
            value++;
        }
        return ans+day;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.next();
        int ans=dayOfYear(date);
        System.out.println(ans);
    }
}
