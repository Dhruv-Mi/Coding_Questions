package com.company;

import java.util.Scanner;
public class Fibonnaci_number {
    public static boolean checkMember(int n){
        int f3=0,f1=1,f2=1;
        while(f3<n){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            if(f3==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0||n==1){
            System.out.println("true");
        }
        else {
            if (checkMember(n)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

