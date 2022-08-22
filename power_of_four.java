package com.company;

import java.util.Scanner;

public class power_of_four {
    public static boolean isPowerOfFour(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%4==0){
                n/=4;
            }
            else{
                break;
            }
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=isPowerOfFour(n);
        System.out.println(ans);
    }
}
