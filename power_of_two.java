package com.company;

import java.util.Scanner;

public class power_of_two {
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n%2==1){
                return false;
            }
            else{
                n=n/2;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=isPowerOfTwo(n);
        System.out.println(ans);
    }
}
