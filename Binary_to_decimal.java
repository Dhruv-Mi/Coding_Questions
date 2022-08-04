package com.company;

import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int decimal=0;
        int k=0;
        while(n!=0){
            int value=n%10;
            decimal=(int)(decimal+value*Math.pow(2,k));
            k++;
            n=n/10;
        }
        System.out.println(decimal);
    }
}
