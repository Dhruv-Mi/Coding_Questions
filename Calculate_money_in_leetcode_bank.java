package com.company;

import java.util.Scanner;

public class Calculate_money_in_leetcode_bank {
    public static int totalMoney(int n){
        int ans=0;
        int day=1;
        int value=1;
        int week=1;
        while(day<=n){
            if(day!=1 && day%7==1){
                week=week+1;
                value=week;
            }
            ans=ans+value;
            value=value+1;
            day++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=totalMoney(n);
        System.out.println(ans);
    }
}
