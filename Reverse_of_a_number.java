package com.company;

import java.util.Scanner;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextInt();
        long num=0;
        while(n!=0){
            int a=(int)n%10;
            num=num*10+a;
            n=n/10;
        }
        System.out.println(num);
    }
}
