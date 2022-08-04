package com.company;

import java.util.Scanner;

public class Nth_fabonnaci_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        int f1=1,f2=1;
        int sum=1;
        for(i=1;i<=n-2;i++){
            sum=f1+f2;
            f1=f2;
            f2=sum;
        }
        System.out.println(sum);
    }
}
