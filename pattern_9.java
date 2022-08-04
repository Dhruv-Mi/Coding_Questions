package com.company;

import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        int k=n;
        for(i=n;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print(k);
            }
            k=k-1;
            System.out.println();
        }
    }
}
