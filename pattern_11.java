package com.company;

import java.util.Scanner;

public class pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int k=i;
            for(j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            k=k-2;
            for(j=1;j<i;j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
