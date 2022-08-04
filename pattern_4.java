package com.company;

import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            int k=i;
            for(j=1;j<=i;j++){
                System.out.print(k--);
            }
            System.out.println();
        }
    }
}