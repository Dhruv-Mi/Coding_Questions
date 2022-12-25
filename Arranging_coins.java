package com.company;

import java.util.Scanner;

public class Arranging_coins {
    public static int arrangeCoins(int n){
        int i=1;
        int count=0;
        while(i<=n){
            n=n-i;
            i++;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=arrangeCoins(n);
        System.out.println(ans);
    }
}
