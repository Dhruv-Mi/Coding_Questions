package com.company;

import java.util.Scanner;

public class Lemonade_change {
    public static boolean lemonadeChange(int[] bills){
        int count_5=0;
        int count_10=0;
        for (int temp : bills) {
            if (temp == 10) {
                count_10++;
                if (count_5 >= 1) {
                    count_5--;
                }
                else {
                    return false;
                }
            }
            else if (temp == 20) {
                if (count_5 >= 1 && count_10 >= 1) {
                    count_5--;
                    count_10--;
                }
                else if(count_5>=3){
                    count_5=count_5-3;
                }
                else {
                    return false;
                }
            }
            else {
                count_5++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] bills=new int[n];
        for(int i=0;i<n;i++){
            bills[i]= sc.nextInt();
        }
        boolean ans=lemonadeChange(bills);
        System.out.println(ans);
    }
}
