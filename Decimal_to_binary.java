package com.company;

import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String binary="";
        if(n==0){
            System.out.println(0);
            Object retun;
        }
        while(n!=0){
            if(n%2==0){
                binary='0'+binary;
            }
            else{
                binary='1'+binary;
            }
            n=n/2;
        }
        System.out.println(binary);
    }
}
