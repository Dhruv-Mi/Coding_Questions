package com.company;

import java.util.Scanner;

public class sqrt_x {
    public static int mySqrt(int x){
        return (int) Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=mySqrt(n);
        System.out.println(ans);
    }
}
