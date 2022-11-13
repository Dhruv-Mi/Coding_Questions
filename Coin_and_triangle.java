package com.company;

import java.util.Scanner;

public class Coin_and_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int count=0;
            int j=1;
            while(n>=j){
                n=n-j;
                j++;
                count++;
            }
            System.out.println(count);
        }
    }
}
