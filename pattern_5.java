package com.company;

import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }
}
