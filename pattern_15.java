package com.company;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            int k=0;
            for(j=1;j<i+1;j++){
                k=k+j;
                if(j==i){
                    System.out.print(j+"=");
                }
                else{
                    System.out.print(j+"+");
                }
            }
            System.out.print(k);
            System.out.println();
        }
    }
}
