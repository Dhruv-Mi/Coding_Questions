package com.company;

import java.util.Scanner;

public class add_digits {
    public static int addDigits(int num){
        if(num%10==num){
            return num;
        }
        else{
            while(num%10!=num){
                int temp=0;
                while(num!=0){
                    temp=temp+num%10;
                    num=num/10;
                }
                num=temp;
            }
            return num;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=addDigits(n);
        System.out.println(ans);
    }
}
