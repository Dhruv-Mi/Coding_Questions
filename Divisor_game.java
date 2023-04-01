package com.company;

import java.util.Scanner;

public class Divisor_game {
    public static boolean divisorGame(int n){
        int count=0;
        for(int x=1;x<n;x++){
            if(n%x==0){
                n=n-x;
                count++;
                x=0;
            }
        }
        return count % 2 != 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=divisorGame(n);
        System.out.println(ans);
    }
}
