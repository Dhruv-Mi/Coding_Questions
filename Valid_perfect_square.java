package com.company;

import java.util.Scanner;

public class Valid_perfect_square {
    public static boolean isPerfectSquare(int num){
        for(int i=0;i*i>=0&&i*i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=isPerfectSquare(n);
        System.out.println(ans);
    }
}
