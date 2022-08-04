package com.company;

import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        int k=n;
        for(i=1;i<=n;i++){
            int a=n;
            for(j=1;j<=n;j++){
                if(j==k) {
                    System.out.print("*");
                    k--;
                    a--;
                }
                else{
                    System.out.print(a);
                    a--;
                }
            }
            System.out.println();
        }
    }
}
