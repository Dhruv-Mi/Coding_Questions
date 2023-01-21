package com.company;

import java.util.Scanner;

public class Perfect_integer {
    public static boolean checkPerfectNumber(int num){
        int sum=0;
        int i=1;
        while(i<=(num/2)){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        return sum==num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=checkPerfectNumber(n);
        System.out.println(ans);
    }
}
