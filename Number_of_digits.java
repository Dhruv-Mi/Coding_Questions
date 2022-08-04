package com.company;

import java.util.Scanner;

public class Number_of_digits {
    public static int count(int n){
        int num=1;
        if(n%10!=0){
            n=n/10;
            int i=count(n);
            num=num+i;
            return num;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=count(n);
        System.out.println(ans);
    }
}
