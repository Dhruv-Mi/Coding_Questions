package com.company;

import java.util.Scanner;

public class prime_generator {
    public static boolean isPrime(int num){
        if(num==1 || num==0){
            return false;
        }
        for (int i=2;i<=(num/i);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            while(a<=b){
                boolean check=isPrime(a);
                if(check){
                    System.out.println(a);
                }
                a++;
            }
            System.out.println();
        }
    }
}
