package com.company;

import java.util.Scanner;

public class ugly_number {
    public static boolean isUgly(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=isUgly(n);
        System.out.println(ans);
    }
}
