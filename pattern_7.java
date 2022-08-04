package com.company;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            char b=(char)('A'+n-1-i);
            for(j=0;j<=i;j++){
                System.out.print(b);
                b=(char)(b+1);
            }
            System.out.println();
        }
    }
}
