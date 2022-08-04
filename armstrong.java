package com.company;

import java.util.Scanner;

public class armstrong {
    public static int length(int n){
        int length=0;
        while(n!=0){
            n=n/10;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_number=n;
        int length=length(n);
        int num=0;
        while(n!=0) {
            int temp=n%10;
            n=n/10;
            num+=Math.pow(temp,length);
        }
        if (original_number==num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
